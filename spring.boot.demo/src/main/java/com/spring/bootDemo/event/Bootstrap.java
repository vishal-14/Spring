package com.spring.bootDemo.event;

import com.spring.bootDemo.entity.Student;
import com.spring.bootDemo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.Iterator;
/*Bootstrap Data for Student Domain*/
@Component
public class Bootstrap {
    @Autowired
    StudentRepository studentRepository;
    @EventListener(ApplicationStartedEvent.class)
    public void init() {
        Iterator<Student> studentIterator = studentRepository.findAll().iterator();
        if (!studentIterator.hasNext()) {
            for (int i = 1; i <= 10; i++) {
                Student student = new Student(i, "Student" + i, i);
                studentRepository.save(student);
                System.out.println("\nStudent " + i + " inserted in table!");
            }
        }
        System.out.println("\nYour Application is up and running");
    }
}
