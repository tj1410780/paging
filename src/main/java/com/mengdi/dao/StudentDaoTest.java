package com.mengdi.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mengdi.entity.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class StudentDaoTest {

	@Resource
	private StudentDao studentDao;
	
	@Test
	public void testQueryByName() {
		String name = "张天";
		Student student = studentDao.queryByName(name);
		System.out.println(student);
	}

	@Test
	public void testQueryByGender() {
	
	}

	@Test
	public void testQueryAll() {
		fail("Not yet implemented");
	}

	@Test
	public void testGetCount() {
		fail("Not yet implemented");
	}

}
