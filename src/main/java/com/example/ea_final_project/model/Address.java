package com.example.ea_final_project.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address {
    @Id
    @GeneratedValue
    private Integer id;
    private String street;
    private String city;
    private String postalCode;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Country country;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private State state;

    public Address(String street, String city, String postalCode,State state, Country country) {
        this.street = street;
        this.city = city;
        this.postalCode = postalCode;
        this.country = country;
        this.state = state;
    }
}
