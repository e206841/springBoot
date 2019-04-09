package com.ln.springBoot.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ln.springBoot.core.properties.TestProperties;

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
	@Autowired
	private  TestProperties pro;
	@RequestMapping("/hello")
	public String hello() {
		String name = pro.getName();
		String title = pro.getTitle();
		return "自定义配置,name:"+name+",title:"+title;
	}
}
