package com.imran_group.SpringFieldsValidation.service.Implementer;

import com.imran_group.SpringFieldsValidation.dto.StudentRequest;
import com.imran_group.SpringFieldsValidation.entity.Student;
import com.imran_group.SpringFieldsValidation.repository.StudentRepository;
import com.imran_group.SpringFieldsValidation.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImplementer implements StudentService {
    @Autowired
    private StudentRepository studentRepository;
    @Override
    public void addStudent(Student student) {
        studentRepository.save(student);
    }
}
