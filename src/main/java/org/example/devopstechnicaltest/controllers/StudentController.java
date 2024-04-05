package org.example.devopstechnicaltest.controllers;


import lombok.AllArgsConstructor;
import org.example.devopstechnicaltest.entities.Student;
import org.example.devopstechnicaltest.iservice.IStudentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    IStudentService iStudentService;

    @PostMapping("/create")
    public Student create_student(@RequestBody Student student){
        return iStudentService.addStudent(student);
    }

    @GetMapping("/retrieve")
    public List<Student> retrieve_students(){
        return iStudentService.retrieveStudents();
    }

    @DeleteMapping("/retrieve/{id}")
    public void remove_student(@PathVariable("id") String id){
         iStudentService.deleteStudent(id);
    }
}
