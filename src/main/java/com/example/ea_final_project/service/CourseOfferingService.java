package com.example.ea_final_project.service;

import com.example.ea_final_project.model.CourseOffering;
import com.example.ea_final_project.repository.CourseOfferingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseOfferingService implements ICourseOfferingService{
    @Autowired
    private CourseOfferingRepository repository;

    @Override
    public CourseOffering create(CourseOffering courseOffering) {
        return repository.save(courseOffering);
    }
}
