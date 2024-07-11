package com.imran_group.SpringFieldsValidation.repository;

import com.imran_group.SpringFieldsValidation.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
