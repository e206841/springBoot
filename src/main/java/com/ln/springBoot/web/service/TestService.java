package com.ln.springBoot.web.service;

import java.util.List;

import com.ln.springBoot.web.bean.Student;

public interface TestService{
	public int insert(Student studnet);
	public List<Student> selectList();
	public Student selectById(Integer id);
}
