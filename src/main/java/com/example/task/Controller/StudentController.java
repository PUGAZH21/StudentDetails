package com.example.task.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.task.Entity.student;
import com.example.task.Service.StudentService;
import com.example.task.exception.AgeNotFoundException;

@RestController
@RequestMapping(value = "/Student")
public class StudentController {
	@Autowired
	StudentService stuSer;

	@PostMapping(value = "/add")
	public String insertStudent(@RequestBody student s) throws AgeNotFoundException {
		return stuSer.insertStudent(s);
	}

	@PostMapping(value = "/all")
	public String listall(@RequestBody List<student> s) {
		return stuSer.listall(s);
	}
}
