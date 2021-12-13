package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Registration;
import com.example.ea_final_project.model.RegistrationGroup;

import java.util.List;

public interface IRegistrationGroupService {
    public RegistrationGroup create(RegistrationGroup group);
    public RegistrationGroup findRegistrationGroupById(Integer id);
    public List<RegistrationGroup> findAllRegistrationGroup();
    public RegistrationGroup updateRegistrationGroup(Integer id,RegistrationGroup registration);
    public void deleteRegistrationGroup(Integer id);
}

