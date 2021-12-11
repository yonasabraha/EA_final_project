package com.example.ea_final_project.service;

import com.example.ea_final_project.model.Student;
import com.example.ea_final_project.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService implements IStudentService{
    @Autowired
    private StudentRepository repository;

    @Override
    public Student create(Student student) {
        return repository.save(student);
    }
}
