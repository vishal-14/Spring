package com.jpa.demo.service;

import com.jpa.demo.entity.Person;
import com.jpa.demo.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class JpaService {
    @Autowired
    private PersonRepository personRepository;

    /*
     * Question 3
     * Perform all the methods inside CrudRepository for Person Class.
     * */
    public void savePerson(Person person) {
        personRepository.save(person);
    }

    public void savePersons(List<Person> personList) {
        personRepository.save(personList);
    }

    public void search(int id) {
        System.out.println(personRepository.findOne(id));
    }

    public boolean isExist(int id) {
        return personRepository.exists(id);
    }

    public List<Person> findAll() {
        return (List<Person>) personRepository.findAll();
    }

    public long numberCount() {
        return personRepository.count();
    }

    public void deleteOne(int id) {
        personRepository.delete(id);
    }

    public void deleteTwo(Person person) {
        personRepository.delete(person);
    }

    public void deleteThree(List<Person> personList) {
        personRepository.delete(personList);
    }

    public void deleteAll() {
        personRepository.deleteAll();
    }

    public void findByFirstname(String name) {
        System.out.println(personRepository.findByFirstname(name));
    }

    public void findByLastname(String name) {
        System.out.println(personRepository.findByLastname(name));
    }

    public void findById(int id){
        System.out.println(personRepository.findById(id));
    }

    public void findByAgeFirstname(int age){
        System.out.println(personRepository.findByAge(age));
    }

    public String findByAgeFirstnameLastname(int age){
        return personRepository.findByAge(age);
    }

    public void findByAgePerson(int age)
    {
        System.out.println(personRepository.findByAge(age));
    }

    public void findByFirstNameCount(String name)
    {
        System.out.println(personRepository.findByFirstname(name));
    }

    public int countPerson(String name) {
        return personRepository.countByFirstname(name);
    }

    public Person findDistinctAge(Integer age) {
        return personRepository.findDistinctByAge(age);
    }

    public Person findNameorAge(String name, Integer age) {
        return personRepository.findByFirstnameOrAge(name, age);
    }

    public Person findNameandAge(String name, Integer age) {
        return personRepository.findByFirstnameAndAge(name, age);
    }

    public List<Person> findBetween(int start, int end) {
        return personRepository.findByAgeBetween(start, end);
    }

    public List<Person> lessThanDemo(int salary) {
        return personRepository.findBySalaryLessThan(salary);
    }

    public List<Person> greaterThanSalary(int salary) {
        return personRepository.findBySalaryGreaterThan(salary);
    }

    public Person likeDemo(String firstname) {
        return personRepository.findByFirstnameLike(firstname);
    }

    public List<Person> notDemo(String lastname) {
        return personRepository.findByLastnameNot(lastname);
    }

    public List<Person> inDemo(List<Integer> ageList) {
        return personRepository.findByAgeIn(ageList);
    }

    public List<Person> ignoreCaseDemo(String firstname) {
        return personRepository.findByFirstnameIgnoreCase(firstname);
    }

    public List<Person> sortQueryMethod(int age) {
        return personRepository.findByAgeGreaterThanOrderByIdDesc(age);
    }

    public List<Person> sortMethod() {
        return personRepository.findAll(new Sort(Sort.Direction.DESC, "id"));
    }

    public List<Person> pagebleDemo(){
        return personRepository.findAll(new PageRequest(1,2,new Sort(Sort.Direction.DESC,"age"))).getContent();
    }
}
