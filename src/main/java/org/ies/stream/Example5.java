package org.ies.stream;

import org.ies.model.Student;

import java.util.List;

public class Example5 {
    public static void main(String[] args) {
    }
    public static List<String> mapToEmails(List<Student> students){
        return students
                .stream()
                .map(Student::getEmail)
                .toList();
    }
}
