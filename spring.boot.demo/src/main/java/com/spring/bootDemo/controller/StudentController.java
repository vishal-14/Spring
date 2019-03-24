package com.spring.bootDemo.controller;

import com.spring.bootDemo.entity.Student;
import com.spring.bootDemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/student")
    public List<Student> getStudents(){
        return studentService.getStudentList();
    }
}
