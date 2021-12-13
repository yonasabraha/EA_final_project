package com.example.ea_final_project.controller;

import com.example.ea_final_project.model.Faculty;
import com.example.ea_final_project.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculties")
public class FacultyController {
    @Autowired
    FacultyService service;

    @GetMapping
    public List<Faculty> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Faculty findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Faculty create(@RequestBody Faculty faculty) {
        return service.create(faculty);
    }

    @PatchMapping("/{id}")
    public Faculty update(@PathVariable Integer id, @RequestBody Faculty faculty) {
        Faculty persistedFaculty = service.findById(faculty.getId());
        if (persistedFaculty != null) {
            persistedFaculty.setFirstname(faculty.getFirstname());
            persistedFaculty.setLastname(faculty.getLastname());
            persistedFaculty.setEmail(faculty.getEmail());
            persistedFaculty.setTitle(faculty.getTitle());
            return service.update(persistedFaculty);
        }
        return faculty;
    }
}
