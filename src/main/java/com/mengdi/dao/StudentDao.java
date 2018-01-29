package com.mengdi.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.mengdi.entity.Student;

public interface StudentDao {
	Student queryByName(String name);
	
	List<Student> queryByGender(@Param("gender") String gender, @Param("offset") int offset, @Param("pageSize") int pageSize);
	
	List<Student> queryAll(@Param("offset") int offset, @Param("pageSize") int pageSize);
	
	int getCount();
}
