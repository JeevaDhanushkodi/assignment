package com.dibber.assignment.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Parent {

    private int parentGuardianId;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
    private String address;
}
