package com.service.predicate.dto;

import com.service.predicate.annotation.ValidDepartmentName;
import lombok.Data;

import java.io.Serializable;

@Data
public class DepartmentDto implements Serializable {

    @ValidDepartmentName
    private String name;
}
