package com.imran_group.SpringFieldsValidation.service;

import com.imran_group.SpringFieldsValidation.dto.StudentRequest;
import com.imran_group.SpringFieldsValidation.entity.Student;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    void addStudent(Student student);
}
