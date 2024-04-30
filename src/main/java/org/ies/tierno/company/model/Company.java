package org.ies.tierno.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.ies.tierno.company.exceptions.DepartmentNotFoundException;
import org.ies.tierno.company.exceptions.EmployeeNotFoundException;

import java.util.List;

@Data
@AllArgsConstructor
public class Company {
    private String name;
    private String cif;
    private List<Department> departments;

    public List<Employee> getDepartmentEmployees(String departmentName) throws DepartmentNotFoundException {
        return getDepartment(departmentName).getEmployees();
    }

    public Department getDepartment(String departmentName) throws DepartmentNotFoundException {
        for (var department : departments) {
            if (department.getName().equalsIgnoreCase(departmentName)) {
                return department;
            }
        }
        throw new DepartmentNotFoundException(departmentName);
    }

    public Employee getEmployee(String nif) throws EmployeeNotFoundException {
//        return departments
//                .stream()
//                .flatMap(d -> d.getEmployees().stream())
//                .filter(e -> e.getNif().equalsIgnoreCase(nif))
//                .findFirst()
//                .orElseThrow(() -> new EmployeeNotFoundException(nif));
        for (var department : departments) {
            for (var employee : department.getEmployees()) {
                if (employee.getNif().equalsIgnoreCase(nif)) {
                    return employee;
                }
            }
        }
        throw new EmployeeNotFoundException(nif);
    }
}
