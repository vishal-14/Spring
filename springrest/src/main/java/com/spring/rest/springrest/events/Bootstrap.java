package com.spring.rest.springrest.events;

import com.spring.rest.springrest.entity.Student;
import com.spring.rest.springrest.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Bootstrap {
    @Autowired
    StudentService studentService;

    @EventListener(ContextRefreshedEvent.class)
    public void insertStudentData(){
        List<Student> studentList = studentService.getStudentsList();
        if(studentList.isEmpty())
        {
            List<Student> newStudentList= Arrays.asList(new Student("Stark",24),
                    new Student("Steve",20),new Student("Peter",30 ));
            studentService.saveAll(newStudentList);
        }
    }
}
