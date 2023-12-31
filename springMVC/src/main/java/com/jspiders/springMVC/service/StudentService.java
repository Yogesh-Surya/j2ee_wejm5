package com.jspiders.springMVC.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jspiders.springMVC.pojo.StudentPOJO;
import com.jspiders.springMVC.repository.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	private StudentRepository repository;

	public StudentPOJO addStudent(String name, String email,
						long mobile, String address) {
		StudentPOJO pojo = repository.addStudent
							(name, email, mobile, address);
		return pojo;
	}
	
	public StudentPOJO searchStudent(int id) {
		StudentPOJO pojo = repository.searchStudent(id);
		return pojo;
	}

}