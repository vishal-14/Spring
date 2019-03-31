package com.spring.rest.springrest.exception;

public class DuplicateStudentFoundException extends RuntimeException {
    public DuplicateStudentFoundException(String message) {
        super(message);
    }
}
