package com.ln.springBoot.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.ln.springBoot.core.filter.TestFilter;
import com.ln.springBoot.core.properties.TestProperties;
import com.ln.springBoot.web.bean.Student;
import com.ln.springBoot.web.service.TestService;

/**
 * @RestController
 * 	意思就是controller里面的方法都以json格式输出，不用再写什么jackjson配置的了！
 *
 * @author linan  
 * @date 2019年4月9日  
 * @version 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {
	Logger logger = Logger.getLogger(TestController.class);
	
	@Autowired
	private  TestProperties pro;
	@Autowired
	private  TestService testService;
	@RequestMapping("/hello")
	public String hello() {
		logger.info("hello");
		String name = pro.getName();
		String title = pro.getTitle();
		return "自定义配置,name:"+name+",title:"+title;
	}
	@RequestMapping("/selectById")
	public Student selectById() {
		return testService.selectById(1);
	}
	@RequestMapping("/selectList")
	public List<Student> selectList() {
		PageHelper.startPage(1, 2);
		return testService.selectList();
	}
}
