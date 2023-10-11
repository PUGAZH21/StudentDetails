package com.example.task.Dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.task.Entity.student;
import com.example.task.Repository.StudentRepo;

@Repository
public class StudentDao {
	@Autowired
	StudentRepo stuRepo;

	public String insertStudent(student s) {
		stuRepo.save(s);
		return "SUCCESSFULLY POSTED";
	}

	public String  listall(List <student> s) {
		stuRepo.saveAll(s);
		return "LIST POSTED";
	}
}