package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Address;
import com.example.ea_final_project.repository.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AddressService implements IAddressService{
    @Autowired
    private AddressRepository repository;

    @Override
    public List<Address> findAll() {
        return repository.findAll();
    }

    @Override
    public Address findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public Address create(Address address) {
        return repository.save(address);
    }

    @Override
    public Address update(Address manufacturer) {
        return repository.save(manufacturer);
    }
}
