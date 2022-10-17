package com.example.lab9_springboottemplates.service;

import com.example.lab9_springboottemplates.entity.Student;
import com.example.lab9_springboottemplates.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student theStudent){
        return repository.save(theStudent);
    }

    public List<Student> getAllStudent(){
        return repository.findAll();
    }

    public Optional<Student> getStudentById(String studentId){
        return repository.findById(studentId);
    }

    public String deleteStudentById(String studentId){
        repository.deleteById(studentId);

        return "Delete successful Student Id: " + studentId;
    }



}
