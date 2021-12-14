package com.example.ea_final_project.controller;

import com.example.ea_final_project.model.Registration;
import com.example.ea_final_project.model.RegistrationGroup;
import com.example.ea_final_project.service.RegistrationGroupService;
import com.example.ea_final_project.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/registrationGroups")
public class RegistrationGroupController {

    @Autowired
    private RegistrationGroupService service;

    @GetMapping()
    public List<RegistrationGroup> findAll(){
        return service.findAllRegistrationGroup();
    }



    @GetMapping("/{id}")
    public RegistrationGroup findById(@PathVariable Integer id) {
        return service.findRegistrationGroupById(id);

    }
    @PostMapping("/saveRegistrationGroup")
    public RegistrationGroup addRegistrationGroup(@RequestBody RegistrationGroup registrationGroup) {
        return service.create(registrationGroup);
    }



    @DeleteMapping("/{id}")
    public void deleteRegistrationGroupById(@PathVariable Integer id){
        service.deleteRegistrationGroup(id);
    }
    @PutMapping("/{id}")
    public RegistrationGroup updateRegistrationGroup(@PathVariable Integer id,
                                           @RequestBody RegistrationGroup registrationGroup){
        return service.updateRegistrationGroup(id,registrationGroup);


    }

}
