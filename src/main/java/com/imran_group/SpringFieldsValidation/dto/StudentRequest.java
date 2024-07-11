package com.imran_group.SpringFieldsValidation.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
public class StudentRequest {
    private String name;
    private String age;
    private String nationality;
    private String phonenumber;
}
