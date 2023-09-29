package org.example;

import org.example.school.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Aljoscha","Nyang","D12345"));
        students.add(new Student("Fabian","Link","D24454"));
        students.add(new Student("Dominic","Bergmann","D45345"));

        for(Student s: students) {
            System.out.println(s.getFirstName());
        }

    }
}