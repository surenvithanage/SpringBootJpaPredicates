package com.service.predicate.service.address;

import com.service.predicate.entity.Address;

import java.util.List;

public interface AddressService {
    List<Address> fetch();

    Address save(Address address);

    Address update(Long id, Address address);

    Address delete(Long id);
}
