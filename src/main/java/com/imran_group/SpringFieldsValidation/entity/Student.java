package com.imran_group.SpringFieldsValidation.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "StudentTable")
@AllArgsConstructor(staticName = "build")
@NoArgsConstructor
@Entity
public class Student {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull(message = "name can't be empty")
    private String name;
    @Min(18)
    @Max(60)
    private String age;
    @NotNull(message = "nationality should not be null")
    private String nationality;
    @NotNull(message = "phone number should not be null")
    @Pattern(regexp = "^\\d{11}$", message = "invalid phone number")
    private String phonenumber;

}
