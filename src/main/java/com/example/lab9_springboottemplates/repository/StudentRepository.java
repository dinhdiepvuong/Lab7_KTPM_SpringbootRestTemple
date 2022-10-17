package com.example.lab9_springboottemplates.repository;

import com.example.lab9_springboottemplates.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, String> {

//    public Student getAllById(String studentId);
}
