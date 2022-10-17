package com.example.lab9_springboottemplates.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

//@Getter
//@Setter
//@ToString
//@AllArgsConstructor
//@NoArgsConstructor
//@Builder
@Data
@Entity
@Table(name = "student")
public class Student implements Serializable {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private String maSV;

    @Column(name = "student_name")
    private String tenSV;

    @Column(name = "student_age")
    private Integer tuoiSV;
}
