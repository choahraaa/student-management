package com.example.studentmanagement.service.impl;

import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.enums.exception.ApiExceptionType;
import com.example.studentmanagement.exception.ApiException;
import com.example.studentmanagement.mapper.StudentMapper;
import com.example.studentmanagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentMapper studentMapper;

    @Override
    public List<Student> search(Student student) throws ApiException {
        if(student.getId() == null) {
            throw new ApiException(ApiExceptionType.BAD_REQUEST_BODY, "studentId");
        }
        return studentMapper.search(student);
    }

    @Override
    public Student fetch(Student student) throws ApiException {
        if(student.getPhone() == null) {
            throw new ApiException(ApiExceptionType.BAD_REQUEST_BODY, "phone");
        }
        return studentMapper.fetch(student);
    }

    @Override
    public void insert(Student student) throws ApiException {
        if(student.getPhone() == null) {
            throw new ApiException(ApiExceptionType.BAD_REQUEST_BODY, "phone");
        }

        if(student.getName() == null) {
            throw new ApiException(ApiExceptionType.BAD_REQUEST_BODY, "name");
        }

        if(student.getSchoolType() == null) {
            throw new ApiException(ApiExceptionType.BAD_REQUEST_BODY, "schoolType");
        }

        if(student.getAge() < 8 || student.getAge() > 19) {
            throw new ApiException(ApiExceptionType.INVALID);
        }

        studentMapper.insert(student);
    }

    @Override
    public void delete(Student student) {
        studentMapper.delete(student);
    }
}
