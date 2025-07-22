package com.service.predicate.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class AddressDto implements Serializable {
    private String street;
    private String city;
    private String state;
    private String postalCode;
}
