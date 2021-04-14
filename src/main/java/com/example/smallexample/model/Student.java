package com.example.smallexample.model;


import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student_Table")
@Data
public class Student {

    @Id
    @Column(name = "student_id")
    private Long id;


    private String studentName;



}
