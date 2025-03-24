package org.ies.stream;

import org.ies.model.Student;

import java.util.List;

public class Example6 {
    public static List<Student> filterByZipCode (List<Student> students, int zipCode){
       return students
                .stream()
                .filter(student -> student.getZipCode() == zipCode)
                .toList();
    }
}
