package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Address;

import java.util.List;

public interface IAddressService {
    public List<Address> findAll();
    public Address findById(Integer id) ;
    public Address create(Address address);
    public Address update(Address address);
}
