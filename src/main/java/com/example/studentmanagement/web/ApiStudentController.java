package com.example.studentmanagement.web;


import com.example.studentmanagement.entity.Student;
import com.example.studentmanagement.enums.exception.ApiExceptionType;
import com.example.studentmanagement.exception.ApiException;
import com.example.studentmanagement.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/students")
@RequiredArgsConstructor
public class ApiStudentController {

    private final StudentService studentService;

    @GetMapping("")
    public ResponseEntity<?> search(Student student) throws ApiException {
        return new ResponseEntity<>(studentService.search(student), HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<?> fetch(@PathVariable("id") String id) throws ApiException {
        return new ResponseEntity<>(studentService.fetch(Student.builder().id(id).build()), HttpStatus.OK);
    }

    @PostMapping("")
    public ResponseEntity<?> insert(Student student) throws ApiException {
        Student fetch = studentService.fetch(student.builder().phone(student.getPhone()).build());
        if(fetch != null) {
            throw new ApiException(ApiExceptionType.ALREADY_EXIST_STUDENT, student.getPhone());
        }
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<?> delete(@PathVariable("id") String id) throws ApiException {
        studentService.delete(Student.builder().id(id).build());
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
