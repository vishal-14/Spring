package com.spring.rest.springrest.service;

import com.spring.rest.springrest.entity.Student;
import com.spring.rest.springrest.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudentsList() {
        return (List<Student>) studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        Student savedStudent = studentRepository.save(student);
        return savedStudent;
    }

    public Student getStudentById(Integer id) {
        Optional<Student> studentOptional = studentRepository.findById(id);
        return studentOptional.orElse(null);
    }

    public void deleteStudent(Student student) {
        studentRepository.delete(student);
    }

    public void saveAll(Iterable<Student> studentIterable) {
        studentRepository.saveAll(studentIterable);
    }

}
