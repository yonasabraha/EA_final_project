package com.example.ea_final_project.controller;

import com.example.ea_final_project.model.Registration;
import com.example.ea_final_project.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/registrations")
public class RegistrationController {
    
    @Autowired
    private RegistrationService service;
    
    @GetMapping()
    public List<Registration> findAll(){
        return service.findAllRegistration();
    }
    
   
    
    @GetMapping("/{id}")
    public Registration findById(@PathVariable Integer id) {
        return service.findRegistrationById(id);

    }
    @PostMapping("/saveRegistration")
    public Registration addRegistration(@RequestBody Registration registration) {
       return service.create(registration);
    }



    @DeleteMapping("/{id}")
    public void deleteRegistrationById(@PathVariable Integer id){
        service.deleteRegistration(id);
    }
    @PutMapping("/{id}")
    public Registration updateRegistration(@PathVariable Integer id,
                                           @RequestBody Registration registration){
        return service.updateRegistration(id,registration);


    }



}
