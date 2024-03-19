package com.example.studentmanagement.mapper;

import com.example.studentmanagement.entity.Student;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface StudentMapper {

    List<Student> search(Student student);

    Student fetch(Student student);

    void insert(Student student);

    void delete(Student student);
}
