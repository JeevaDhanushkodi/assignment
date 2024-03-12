package com.dibber.assignment.entity;

import java.util.List;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class School {

	private int schoolId;
    private String name;
    private String cityArea;
    private List<Department> departments;
}
