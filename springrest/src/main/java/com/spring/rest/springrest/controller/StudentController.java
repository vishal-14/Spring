package com.spring.rest.springrest.controller;

import com.spring.rest.springrest.entity.Student;
import com.spring.rest.springrest.exception.DuplicateStudentFoundException;
import com.spring.rest.springrest.exception.StudentNotFoundException;
import com.spring.rest.springrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Locale;

@RestController
public class StudentController {
    @Autowired
    StudentService studentService;
    /*
     * Question 4
     * Perform Internationalization for a greeting message in your app.*/

    @Autowired
    MessageSource messageSource;

    @GetMapping("/")
    public String greet(@RequestHeader(name = "Accept-Language", required = true) Locale locale) {
        return messageSource.getMessage("greeting.message", null, LocaleContextHolder.getLocale());
    }

    /*
     * Question 1
     * Create a Rest API for Student using noun plurals for endpoint and
     * http verbs for different operations*/

    @GetMapping("/students/getList")
    public List<Student> getStudentsList() {
        return studentService.getStudentsList();
    }

    @GetMapping("/students/getStudent/{id}")
    public Student getStudent(@PathVariable Integer id) {
        Student student = studentService.getStudentById(id);
        if (student == null)
            throw new StudentNotFoundException("Student with id: " + id + " doesn't exist");
        return student;
    }

    /*
     * Question 5
     * Return XML Response when new Student is created.
     * */
    //Added @Valid for question 3
    //Added produces for question 5 (jackson dependency in build.gradle
    @PostMapping(value = "/students/postStudent" , produces = "application/xml")
    public Student addStudent(@Valid @RequestBody Student student) {
        Student studentToBeSaved = studentService.getStudentById(student.getId());
        if (!(studentToBeSaved == null))
            throw new DuplicateStudentFoundException("Student with this ID already exists");
        return studentService.addStudent(student);
    }

    @PutMapping("/students/putStudent/{id}")
    public Student updateStudent(@PathVariable Integer id) {
        Student studentToBeUpdated = studentService.getStudentById(id);
        if (studentToBeUpdated == null)
            throw new StudentNotFoundException("User with id " + id + " not found ");
        studentToBeUpdated.setName("Ros");
        return studentService.addStudent(studentToBeUpdated);
    }

    @DeleteMapping("/students/deleteStudent/{id}")
    public void deleteStudent(@PathVariable Integer id) {
        Student studentToBeDeleted = studentService.getStudentById(id);
        if (studentToBeDeleted == null)
            throw new StudentNotFoundException("User with id " + id + " not found ");
        studentService.deleteStudent(studentToBeDeleted);

    }
}
