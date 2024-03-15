package com.example.studentmanagement.entity;

import com.example.studentmanagement.enums.school.SchoolType;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Student {

    private String name;
    private String age;
    private SchoolType schoolType;
    private String phone;
}
