package com.service.predicate.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProfessorDto implements Serializable {
    private String nome;
    private String departmentId;
}
