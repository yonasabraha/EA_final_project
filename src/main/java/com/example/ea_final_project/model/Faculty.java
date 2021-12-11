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
    private String name;
    private String email;
    private String title;

    public Faculty(String name, String email, String title) {
        this.name = name;
        this.email = email;
        this.title = title;
    }
}
