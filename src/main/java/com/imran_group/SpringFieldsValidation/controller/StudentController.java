package com.imran_group.SpringFieldsValidation.controller;

import com.imran_group.SpringFieldsValidation.dto.StudentRequest;
import com.imran_group.SpringFieldsValidation.entity.Student;
import com.imran_group.SpringFieldsValidation.service.StudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/add-student")
    public String addStudent(@RequestBody @Valid Student student) {
        studentService.addStudent(student);
        return "Student added successfully";
    }
}
