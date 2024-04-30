package org.ies.tierno.company.exceptions;

public class DepartmentNotFoundException extends Exception{
    private final String departmentName;

    public DepartmentNotFoundException(String departmentName) {
        super("No se ha encontrado el departamento " + departmentName);
        this.departmentName = departmentName;
    }

    public String getDepartmentName() {
        return departmentName;
    }
}
