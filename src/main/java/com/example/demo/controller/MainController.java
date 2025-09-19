package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.DataClass;

@RestController
public class MainController {


    @GetMapping("/greet")
    public ResponseEntity<DataClass> greet()
    {
        DataClass dataClass = new DataClass();
        dataClass.setMessage("Welcome to our Web Application!");
        dataClass.setAssignmentNumber(7);
        dataClass.setCommitNumber(1);
        return ResponseEntity.ok(dataClass);
    }
}
