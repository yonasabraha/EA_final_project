package com.example.ea_final_project.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Faculty {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstname;
    private String lastname;
    private String email;
    private String title;

    public Faculty(String firstname, String lastname, String email, String title) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.title = title;
    }
}
