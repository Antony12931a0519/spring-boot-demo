package com.demo.springbootdemoapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.demo.springbootdemoapp.entities.Student;

@Service
public class StudentService {

	public List<Student> getStudentsList() {

		Student s = new Student();
		s.setAddress("Hyd");
		s.setFirstName("Abc");
		s.setLastName("def");

		List<Student> list = new ArrayList<Student>();
		list.add(s);
		return list;

	}

}
