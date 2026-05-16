package com.krish.spring_boot_mysql_demo.service;

import com.krish.spring_boot_mysql_demo.model.Student;
import com.krish.spring_boot_mysql_demo.repository.StudentRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {

    private final StudentRepository repository;

    public Student saveStudent(Student student)
    {
        return repository.save(student);
    }

    @Transactional
    public Student updateStudent(Long studentId)
    {
        Student student = repository.findById(studentId).orElseThrow();
        student.getAddress().get(0)
                .setBuilding("Aparajita");
        return repository.save(student);
    }

    public List<Student> getAllStudents() {

        return repository.findAll();
    }

    public Student getStudentById(Long studentId)
    {
        return repository.findById(studentId).orElseThrow(() ->
                new RuntimeException(String.format("Student with id %s doesn't exist",studentId)));
    }
}
