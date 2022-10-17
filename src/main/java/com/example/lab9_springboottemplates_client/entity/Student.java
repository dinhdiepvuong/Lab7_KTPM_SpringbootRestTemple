package com.example.lab9_springboottemplates_client.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {

    private String maSV;
    private String tenSV;
    private Integer tuoiSV;
}
