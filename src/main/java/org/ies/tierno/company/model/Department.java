package org.ies.tierno.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Department {
    private String name;
    private List<Employee> employees;
}
