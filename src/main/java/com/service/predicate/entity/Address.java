package com.service.predicate.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String street;

    private String city;

    private String state;

    private String postalCode;

    // Important: Avoid bidirectional if not needed
    @OneToOne(mappedBy = "address")
    private Student student;

}
