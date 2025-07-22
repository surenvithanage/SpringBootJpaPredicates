package com.service.predicate.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class StudentDto implements Serializable {

    @NotBlank(message = "Name is mandatory")
    @Size(min = 3, max = 100, message = "Student name must be at most 100 characters and more than 5 characters")
    private String name;

    @NotBlank(message = "Address is mandatory")
    private String addressId;

    @NotBlank(message = "Department is mandatory")
    private String departmentId;

    private List<String> enrolledCourses;
}
