package org.example.devopstechnicaltest.iservice;

import org.example.devopstechnicaltest.entities.Student;

import java.util.List;

public interface IStudentService {

    Student addStudent(Student student);
    List<Student> retrieveStudents();
    void deleteStudent(String id);
}
