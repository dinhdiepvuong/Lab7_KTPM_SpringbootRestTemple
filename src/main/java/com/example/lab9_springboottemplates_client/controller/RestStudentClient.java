package com.example.lab9_springboottemplates_client.controller;

import com.example.lab9_springboottemplates_client.entity.Student;
import com.example.lab9_springboottemplates_client.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class RestStudentClient {

    @Autowired
    private StudentService service;

    @GetMapping("/student")
    public List<Student> getAllStudent(){

        return service.getAllStudent();
    }
}
