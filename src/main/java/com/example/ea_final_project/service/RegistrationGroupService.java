package com.example.ea_final_project.service;


import com.example.ea_final_project.model.RegistrationGroup;
import com.example.ea_final_project.repository.RegistrationGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class RegistrationGroupService implements IRegistrationGroupService{
    @Autowired
    private RegistrationGroupRepository repository;

    @Override
    public RegistrationGroup create(RegistrationGroup group) {
        return repository.save(group);
    }

    @Override
    public RegistrationGroup findRegistrationGroupById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public List<RegistrationGroup> findAllRegistrationGroup() {
        return repository.findAll();
    }

    @Override
    public RegistrationGroup updateRegistrationGroup(Integer id,RegistrationGroup registrationGroup) {
        RegistrationGroup registrationGroup1= repository.getById(registrationGroup.getId());
        registrationGroup1.setStudents(registrationGroup.getStudents());
        registrationGroup1.setBlocks(registrationGroup.getBlocks());
        return repository.save(registrationGroup1);
    }

    @Override
    public void deleteRegistrationGroup(Integer id) {
        repository.deleteById(id);

    }
}
