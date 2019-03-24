package com.spring.bootDemo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

/*Create a Restful API using Spring Boot for Student.*/
@Entity
public class Student {
    @Id
    private int id;
    private String name;
    private int rollno;
    public Student(){}
    public Student(int id, String name, int rollno) {
        this.id = id;
        this.name = name;
        this.rollno = rollno;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

}