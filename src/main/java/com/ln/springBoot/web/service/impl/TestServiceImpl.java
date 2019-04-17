package com.ln.springBoot.web.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ln.springBoot.web.bean.Student;
import com.ln.springBoot.web.dao.StudentMapper;
import com.ln.springBoot.web.service.TestService;
@Service
public class TestServiceImpl implements TestService{
	@Resource
	private StudentMapper studentMapper;

	@Override
	public int insert(Student studnet) {
		return studentMapper.insert(studnet);
	}

	@Override
	public List<Student> selectList() {
		return studentMapper.selectList();
	}
	@Override
	public Student selectById(Integer id) {
		// TODO Auto-generated method stub
		return studentMapper.selectByPrimaryKey(id);
	}
	

}
