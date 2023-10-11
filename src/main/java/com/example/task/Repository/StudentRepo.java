package com.example.task.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.task.Entity.student;


public interface StudentRepo extends JpaRepository<student, Integer> {
	
}


