package com.example.task.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.task.Dao.StudentDao;
import com.example.task.Entity.student;
import com.example.task.exception.AgeNotFoundException;

@Service
public class StudentService {
	@Autowired
	StudentDao stuDao;

	public String insertStudent(student s)throws AgeNotFoundException {
if(s.getAge()>18) {
	return stuDao.insertStudent(s);
}
else {
	 throw new AgeNotFoundException("You are not eligible for Studies the College");
}

	}

	public String listall(List <student> s) {
		return stuDao.listall(s);
	}

}
