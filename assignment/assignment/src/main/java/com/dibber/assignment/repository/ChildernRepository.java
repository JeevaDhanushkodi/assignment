package com.dibber.assignment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dibber.assignment.entity.Children;

@Repository
public interface ChildernRepository extends JpaRepository<Integer, Children>{

}
