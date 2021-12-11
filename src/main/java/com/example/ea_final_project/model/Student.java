package com.example.ea_final_project.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String studentId;
    private String name;
    private String email;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Address homeAddress;
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Address billingAddress;

    public Student(String studentId, String name, String email, Address homeAddress, Address billingAddress) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.homeAddress = homeAddress;
        this.billingAddress = billingAddress;
    }
}
