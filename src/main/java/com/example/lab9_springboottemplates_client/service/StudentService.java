package com.example.lab9_springboottemplates_client.service;

import com.example.lab9_springboottemplates_client.entity.Student;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {

    private RestTemplate restTemplate = new RestTemplate();

    private String url = "http://localhost:8080/api";

    public List<Student> getAllStudent(){
        ResponseEntity<Student[]> response = restTemplate.getForEntity(url + "/student", Student[].class);

        return Arrays.asList(response.getBody());
    }

    public Student createStudent(Student student){
        return restTemplate.postForObject(url + "/student", student, Student.class);
    }

    public String deleteStudent(String studentId){
        restTemplate.delete(url + "/student/"+studentId+"", Student.class);

        return "Delete student have id: " + studentId;
    }
}
