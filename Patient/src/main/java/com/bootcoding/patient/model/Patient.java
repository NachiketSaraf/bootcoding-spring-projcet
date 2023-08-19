package com.bootcoding.patient.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Patient {
    private int id;
    private String name;
    private int age;
    private String disease;
    private String phoneNo;
}
