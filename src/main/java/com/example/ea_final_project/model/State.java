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
@Table(name = "state_province")
public class State {
    @Id
    @GeneratedValue
    private Integer id;
    private String name;

    public State(String name) {
        this.name = name;
    }

}
