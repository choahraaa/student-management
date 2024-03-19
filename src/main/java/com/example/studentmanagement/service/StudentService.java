package com.example.studentmanagement.service;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.exception.ApiException;

import java.util.List;

public interface StudentService {

    List<Student> search(Student student) throws ApiException;
    Student fetch(Student student) throws ApiException;

    void insert(Student student) throws ApiException;

    void delete(Student student);
}
