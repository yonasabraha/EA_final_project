package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Registration;

import java.util.List;

public interface IRegistrationService {
    public Registration create(Registration registration);
    public Registration findRegistrationById(Integer id);
    public List<Registration> findAllRegistration();
    public Registration updateRegistration(Integer id,Registration registration);
    public void deleteRegistration(Integer id);
}
