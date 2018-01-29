package com.mengdi.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.mengdi.dao.StudentDao;
import com.mengdi.entity.Student;
import com.mengdi.service.StudentService;

@Service
public class StudentServiceImpl implements StudentService {

	@Resource
	private StudentDao studentDao;
	
	public Student getByName(String name) {
		Student student = studentDao.queryByName(name);
		return student;
	}

	public List<Student> getByGender(String gender, int currentPage, int pageSize) {
		int offset = currentPage * pageSize;
		List<Student> list = studentDao.queryByGender(gender, offset, pageSize);
		return list;
	}

	public List<Student> getAll(int currentPage, int pageSize) {
		int offset = currentPage * pageSize;
		List<Student> list = studentDao.queryAll(offset, pageSize);
		return list;
	}

	public int getCount() {
		int count = studentDao.getCount();
		return count;
	}

}
