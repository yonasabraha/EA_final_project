package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Faculty;
import com.example.ea_final_project.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacultyService implements IFacultyService{
    @Autowired
    private FacultyRepository repository;

    @Override
    public Faculty create(Faculty faculty) {
        return repository.save(faculty);
    }
}
