package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Registration;
import com.example.ea_final_project.repository.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService implements IRegistrationService{
    @Autowired
    private RegistrationRepository repository;

    @Override
    public Registration create(Registration registration) {
        return repository.save(registration);
    }

    @Override
    public Registration findRegistrationById(Integer id) {
        return repository.getById(id);
    }

    @Override
    public List<Registration> findAllRegistration() {
        return repository.findAll();
    }

    @Override
    public Registration updateRegistration(Integer id,Registration registration) {
        Registration registration1= repository.getById(id);
        registration1.setStudent(registration.getStudent());
        registration1.setCourseOffering(registration.getCourseOffering());
        return repository.save(registration1);
    }

    @Override
    public void deleteRegistration(Integer id) {
        repository.deleteById(id);

    }


}
