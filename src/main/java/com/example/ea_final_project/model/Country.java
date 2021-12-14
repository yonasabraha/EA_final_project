package com.example.ea_final_project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "country_region")
public class Country {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public Country(String name) {
        this.name = name;
    }
}
