package com.mengdi.service;

import java.util.List;

import com.mengdi.entity.Student;

public interface StudentService {

	Student getByName(String name);
	
	List<Student> getByGender(String gender, int currentPage, int pageSize);
	
	List<Student> getAll(int currentPage, int pageSize);
	
	int getCount();
	
}
