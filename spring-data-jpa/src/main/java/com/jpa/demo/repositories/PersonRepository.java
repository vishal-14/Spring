package com.jpa.demo.repositories;

/*
 * Question 1
 * Create a Person entity with instance variables Firstname, Lastname, salary, age and Id.
 * Question 2
 * Implement CrudRepository for it.
 */

import com.jpa.demo.entity.Person;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface PersonRepository extends CrudRepository<Person, Integer> {
    /*
     * Question 4
     * For class Person find person.
     * Declare methods in repository to find person by firstname, lastname and Id.
     * */
    Person findByFirstname(String firstname);

    Person findByLastname(String lastname);

    Person findById(int id);

    /*
     * Question 6
     * Use @Query to fetch firstname of the Person whose age is 25.
     * */
    @Query("SELECT firstname from Person where age=:age")
    String findByAge(@Param("age") int age);

    /*
     * Question 7
     * Use @Query to fetch firstname and lastname of the Person whose age is 25.
     * */
    @Query("select firstname,lastname from Person where age=:age")
    String findByAge(@Param("age") int age);

    /*
     * Question 8
     * Get complete information of the Employee whose age is 25 using @Query.
     * */
    @Query("select p from Person p where p.age=:age")
    Person findByAge(@Param("age") int age);

    /*
     * Question 9
     * Count Person where name is "Peter" using @Query.
     * */
    @Query("select count(*) from Person where firstname=:firstname")
    int findByFirstname(@Param("firstname") String firstname);

    /*
     * Question 10
     * Implement the given methods*/
    int countByFirstname(String name);

    Person findDistinctByAge(int age);

    Person findByFirstnameOrAge(String firstName, int age);

    Person findByFirstnameAndAge(String name, int age);

    List<Person> findByAgeBetween(int start, int end);

    List<Person> findBySalaryLessThan(int salary);

    List<Person> findBySalaryGreaterThan(int salary);

    Person findByFirstnameLike(String firstname);

    List<Person> findByLastnameNot(String lastname);

    List<Person> findByAgeIn(Collection<Integer> age);

    List<Person> findByFirstnameIgnoreCase(String firstname);

    /*
     * Question 11
     * Get the persons greater than age 25 and sort them in descending order according to id by method query.
     * */
    List<Person> findByAgeGreaterThanOrderByIdDesc(int age);

    /*
     * Question 12
     * Do  the question above using the Sort class.
     */
    @Query("select p from Person p where p.age>25")
    List<Person> findAll(Sort sort);

    /*
     * Question 13
     * Apply Pagination on Person entities.
     * */
    Page<Person> findAll(Pageable pageable);
}
