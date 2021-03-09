package com.demo.springbootdemoapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springbootdemoapp.entities.Student;
import com.demo.springbootdemoapp.service.StudentService;

@RestController("students")
public class StudentController {

	@Autowired
	private StudentService studentService;

	@GetMapping("/list")
	public List<Student> getStudentsList() {
		return studentService.getStudentsList();

	}
	
	@GetMapping("/hello")
	public String test() {
		return "hello";

	}

}
