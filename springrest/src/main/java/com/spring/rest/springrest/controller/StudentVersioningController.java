package com.spring.rest.springrest.controller;

import com.spring.rest.springrest.versioning.StudentV1;
import com.spring.rest.springrest.versioning.StudentV2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*Question 7
 * Create 2 versions of your API one take reprsent name of the Student as single
 * string and other showing firstname and lastname seperately.
 * (Create the Versions of the API using URI, parameter and header versioning)*/
@RestController
public class StudentVersioningController {
    //URI Versioning

    @GetMapping("/student/V1")
    StudentV1 getStudentV1() {
        return new StudentV1("Vishal Aggarwal");
    }

    @GetMapping("/student/V2")
    StudentV2 getStudentV2() {
        return new StudentV2("Vishal", "Aggarwal");
    }

    //Parameter Versioning

    @GetMapping(value = "/student/param", params = "version=1")
    StudentV1 getStudentParam1() {
        return new StudentV1("Vikrant Chauhan");
    }

    @GetMapping(value = "/student/param", params = "version=2")
    StudentV2 getStudentParam2() {
        return new StudentV2("Vikrant", "Chauhan");
    }


    //Header Versioning

    @GetMapping(value = "/student/header", headers = "API-VERSION=1")
    StudentV1 getStudentHeader1() {
        return new StudentV1("Ritesh Singh");
    }

    @GetMapping(value = "/student/header", headers = "API-VERSION=2")
    StudentV2 getStudentHeader2() {
        return new StudentV2("Ritesh", "Singh");
    }

}
