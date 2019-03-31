package com.spring.rest.springrest.repositories;

import com.spring.rest.springrest.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
