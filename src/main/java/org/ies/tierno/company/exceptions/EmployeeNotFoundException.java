package org.ies.tierno.company.exceptions;

public class EmployeeNotFoundException extends Exception {
    private final String nif;

    public EmployeeNotFoundException(String nif) {
        super("No se ha encontrado el empleado " + nif);
        this.nif = nif;
    }

    public String getNif() {
        return nif;
    }
}
