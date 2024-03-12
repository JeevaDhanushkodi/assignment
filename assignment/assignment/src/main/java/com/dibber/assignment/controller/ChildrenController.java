package com.dibber.assignment.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dibber.assignment.entity.Children;

@RestController
@RequestMapping("/api/")
public class ChildrenController {
	
	

	@GetMapping("child")
	public ResponseEntity<Children> getChild(@RequestParam(required = false) String firstName,
			@RequestParam(required = false) String lastName) {
		return null;

	}
	
}
