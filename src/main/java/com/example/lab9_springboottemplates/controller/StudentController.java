package com.example.lab9_springboottemplates.controller;

import com.example.lab9_springboottemplates.entity.Student;
import com.example.lab9_springboottemplates.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/student")
    public List<Student> getALlStudent(){
        return service.getAllStudent();
    }

    @GetMapping("/student/{id}")
    public Optional<Student> getStudentById(@PathVariable("id") String studentId){
        return service.getStudentById(studentId);
    }

    @PostMapping("/student")
    public Student addStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @PutMapping("/student")
    public Student updateStudent(@RequestBody Student student){
        return service.saveStudent(student);
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudent(@PathVariable("id") String studentId){

        service.deleteStudentById(studentId);
        return "Delete Student Id: "+ studentId;
    }


}
