package com.example.lab9_springboottemplates_client.controller;

import com.example.lab9_springboottemplates_client.entity.Student;
import com.example.lab9_springboottemplates_client.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/student")
    public Student createStudent(@RequestBody Student student){
        return service.createStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudentById(@PathVariable("id") String studentId){

        service.deleteStudentById(studentId);
        return "Delete student have id: " + studentId;
    }

    @PutMapping("/student")
    public String updateStudent(@RequestBody Student student){
        service.updateStudent(student);

        return "Update successful";
    }
}
