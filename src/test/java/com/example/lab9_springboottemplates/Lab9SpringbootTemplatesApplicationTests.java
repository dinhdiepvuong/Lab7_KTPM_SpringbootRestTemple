package com.example.lab9_springboottemplates;

import com.example.lab9_springboottemplates.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Lab9SpringbootTemplatesApplicationTests {

    @Autowired
    private StudentService service;

    @Test
    void contextLoads() {
        System.out.println("All list student in my data: ");
        service.getAllStudent().forEach(System.out::println);
    }

}
