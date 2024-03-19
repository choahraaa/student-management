package com.example.studentmanagement.entity;

import com.example.studentmanagement.enums.school.SchoolType;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Builder
public class Student {

    private String id;
    private String name;
    private int age;
    private SchoolType schoolType;
    private String phone;
}
