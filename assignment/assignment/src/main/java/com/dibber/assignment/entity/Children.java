package com.dibber.assignment.entity;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Children implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private int id;
	private String firstName;
	private String lastName;
	private int age;
	private String gender;    
	private LocalDate dateOfBirth;
    private int schoolId; 
    private int departmentId; 
    private int parentGuardianId; 
}
