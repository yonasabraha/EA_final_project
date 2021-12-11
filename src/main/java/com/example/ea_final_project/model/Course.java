package com.example.ea_final_project.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@Entity
public class Course {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;
    private String code;
    private String description;

    public Course(String name, String code, String description) {
        this.name = name;
        this.code = code;
        this.description = description;
    }
}
