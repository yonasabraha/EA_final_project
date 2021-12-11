package com.example.ea_final_project.service;

import com.example.ea_final_project.model.RegistrationGroup;
import com.example.ea_final_project.repository.RegistrationGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RegistrationGroupService implements IRegistrationGroupService{
    @Autowired
    private RegistrationGroupRepository repository;

    @Override
    public RegistrationGroup create(RegistrationGroup group) {
        return repository.save(group);
    }
}
