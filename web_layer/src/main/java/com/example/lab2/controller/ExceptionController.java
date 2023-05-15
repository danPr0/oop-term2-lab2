package com.example.lab2.controller;

import jakarta.persistence.PersistenceException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = {PersistenceException.class})
    public ResponseEntity<?> invalidRequest(PersistenceException ex) {

        return ResponseEntity.badRequest().body("Invalid input: " + ex.getMessage());
    }
}
