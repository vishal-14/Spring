package com.spring.bootDemo.repository;

import com.spring.bootDemo.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student,Integer> {
}
