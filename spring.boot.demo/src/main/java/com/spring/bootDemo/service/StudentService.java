package com.spring.bootDemo.service;

import com.spring.bootDemo.entity.Student;
import com.spring.bootDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> getStudentList() {
        /*return Arrays.asList(new Student(1, "Vishal", 10),
                new Student(2, "Ritesh", 20));*/
        List<Student> studentList = new ArrayList<>();
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        studentIterator.forEachRemaining(studentList::add);
        return studentList;
    }
}

