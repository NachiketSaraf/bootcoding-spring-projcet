package com.bootcoding.patient.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table (name = "patient")
@Entity
public class Patient {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "first_name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "disease")
    private String disease;

    @Column(name = "phone_no")
    private String phoneNo;
}

