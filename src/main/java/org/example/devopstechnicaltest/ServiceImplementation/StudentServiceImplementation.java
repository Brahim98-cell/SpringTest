package org.example.devopstechnicaltest.ServiceImplementation;

import lombok.AllArgsConstructor;
import org.example.devopstechnicaltest.entities.Student;
import org.example.devopstechnicaltest.iservice.IStudentService;
import org.example.devopstechnicaltest.repositories.StudentRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@AllArgsConstructor
@Service
public class StudentServiceImplementation implements IStudentService {

    StudentRepository studentRepository;

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public List<Student> retrieveStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void deleteStudent(String id) {
        studentRepository.deleteById(id);
    }
}
