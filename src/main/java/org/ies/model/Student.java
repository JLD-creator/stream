package org.ies.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
    protected String name;
    protected String surname;
    protected String email;
    protected int zipCode;

}
