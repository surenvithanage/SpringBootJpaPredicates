package com.service.predicate.entity;

import jakarta.persistence.*;
import lombok.Data;
import org.hibernate.annotations.BatchSize;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    // Student cannot exist without a department
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @BatchSize(size = 100)
    private List<Student> students = new ArrayList<>();

    // Professor cannot exist without a department
    @OneToMany(mappedBy = "department", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    @BatchSize(size = 100)
    private List<Professor> professors = new ArrayList<>();

}
