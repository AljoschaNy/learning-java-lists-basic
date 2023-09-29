package org.example;

import org.example.school.School;
import org.example.school.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        School mySchool = new School();

        students.add(new Student("Aljoscha","Nyang","D12345"));
        students.add(new Student("Fabian","Link","D24454"));
        students.add(new Student("Dominic","Bergmann","D45345"));

        Student student1 = new Student("Aljoscha","Nyang","D12345");
        Student student2 = new Student("Fabian","Link","D24454");
        Student student3 = new Student("Dominic","Bergmann","D45345");

        School.addStudent(mySchool,student1);
        School.addStudent(mySchool,student2);
        School.addStudent(mySchool,student3);

        mySchool.printTotalStudents();

        for(Student s: students) {
            System.out.println(s.getFirstName());
        }


    }
}