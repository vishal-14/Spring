package com.jpa.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/*
 * Create a Person entity with instance variables Firstname, Lastname, salary, age and Id.
 * Implement CrudRepository for it.
 */
@Entity
public class Person implements Serializable {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
    private Integer age;
    private Integer salary;

    public Person(){

    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Person(Integer id, String firstname, String lastname, Integer age, Integer salary) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", Firstname='" + firstname + '\'' +
                ", Lastname='" + lastname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }
}
