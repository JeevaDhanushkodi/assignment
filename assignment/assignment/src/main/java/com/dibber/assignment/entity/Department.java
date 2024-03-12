package com.dibber.assignment.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Department {

	 	private int departmentId;
	    private String name;
	    private String gradeLevel;
	    private int schoolId; // Foreign key referencing School

}
