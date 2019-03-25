package com.jpa.demo;

import com.jpa.demo.config.PersistenceContext;
import com.jpa.demo.entity.Person;
import com.jpa.demo.service.JpaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(PersistenceContext.class);
        JpaService jpaService = ctx.getBean(JpaService.class);
        //create person
        Person person = new Person(10, "Vishal", "Aggarwal", 22, 15100);
        /*save method call*/
        jpaService.savePerson(person);

        //create person1,person2.person3,person4,person5
        Person person1 = new Person(20, "Peter", "Parker", 19, 10000);
        Person person2 = new Person(30, "Tony", "Stark", 27, 12345);
        Person person3 = new Person(40, "Steve", "Rogers", 25, 54321);
        Person person4 = new Person(50, "Doctor", "Strange", 30, 55555);
        Person person5 = new Person(60, "Bruce", "Wayne", 40, 88888);
        //creating list of persons
        List<Person> personList = new LinkedList<>();
        personList.add(person1);
        personList.add(person2);
        personList.add(person3);
        personList.add(person4);
        personList.add(person5);
        /*Iterable save method call*/
        jpaService.savePersons(personList);

        /*findOne method call*/
        jpaService.search(20);

        /*exists method call*/
        System.out.println("Person with ID=70 exists? :" + jpaService.isExist(70));

        /*findAll method call*/
        System.out.println("All records in Table: ");
        System.out.println(jpaService.findAll());

        /*count method call*/
        System.out.println("Number of records in Table: " + jpaService.numberCount());

        /*Delete(id) method call*/
        jpaService.deleteOne(60);

        /*Delete(entity) method call*/
        jpaService.deleteTwo(person4);

        List<Person> deleteList= new LinkedList<>();
        deleteList.add(person2);
        deleteList.add(person3);
        /*Delete(iterable) method call*/
        jpaService.deleteThree(deleteList);

        /*deleteAll() method call*/
        jpaService.deleteAll();

        /*
         * Question 4
         * Declare methods in repository to find person by firstname, lastname and Id.
         * Question 5
         * Use the methods declared above to fetch the person.
         * */
        System.out.println("Person with first name Bruce:");
        jpaService.findByFirstname("Bruce");

        System.out.println("Person with last name Stark");
        jpaService.findByLastname("Stark");

        System.out.println("Person with ID 10");
        jpaService.findById(10);
        //Question6
        System.out.println("Firstname of person with age 25");
        jpaService.findByAgeFirstname(25);
        //Question7
        System.out.println("Firstname and lastname of person with age 25");
        System.out.println(jpaService.findByAgeFirstnameLastname(25));
        //Question8
        System.out.println("Person details with age 25:");
        jpaService.findByAgePerson(25);

        //Question9

        System.out.println("Count of persons with firstname as Peter");
        jpaService.findByFirstNameCount("Peter");

        // Quertion 10
        System.out.println("-------------Count by name   " + jpaService.countPerson("Peter"));
        System.out.println("-------------Distinct Age   " + jpaService.findDistinctAge(19));
        System.out.println("-------------Or   " + jpaService.findNameorAge("Tony", 27));
        System.out.println("-------------And   " + jpaService.findNameandAge("Tony", 27));
        System.out.println("-------------Between  " + jpaService.findBetween(20, 27));
        System.out.println("-------------Less Than  " + jpaService.lessThanDemo(15000));
        System.out.println("-------------Greater Than  " + jpaService.greaterThanSalary(15000));
        System.out.println("-------------Like Demo  " + jpaService.likeDemo("ter"));
        System.out.println("-------------Not Demo" + jpaService.notDemo("Strange"));
        List<Integer> ageList = Arrays.asList(20, 21, 22, 23, 24, 25, 26, 27);
        System.out.println("-------------In Demo" + jpaService.inDemo(ageList));
        System.out.println("-------------IgnoreCase Demo  " + jpaService.ignoreCaseDemo("peter"));

        //Question 11
        System.out.println("Persons greater than 25 years of age and sorted "+jpaService.sortQueryMethod(25));

        //Question 12
        System.out.println("Sort method: "+jpaService.sortMethod());

        //Question 13
        System.out.println("Paging: "+jpaService.pagebleDemo());
    }
}
