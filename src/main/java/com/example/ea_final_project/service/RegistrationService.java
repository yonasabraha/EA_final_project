package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Registration;
import com.example.ea_final_project.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService implements IRegistrationService{
    @Autowired
    private RegistrationRepository repository;

    @Override
    public Registration create(Registration registration) {
        return repository.save(registration);
    }
}
