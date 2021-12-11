package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Address;
import com.example.ea_final_project.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddressService implements IAddressService{
    @Autowired
    private AddressRepository repository;

    public Address create(Address address) {
        return repository.save(address);
    }
}
