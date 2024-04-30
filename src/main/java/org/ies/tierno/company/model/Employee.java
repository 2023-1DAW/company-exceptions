package org.ies.tierno.company.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Employee {
    private String nif;
    private String name;
    private String surname;
    private String position;
}
