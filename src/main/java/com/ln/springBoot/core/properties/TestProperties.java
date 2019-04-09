package com.ln.springBoot.core.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * 自定义配置类
 *
 * @author linan  
 * @date 2019年4月9日  
 * @version 1.0
 */
@Component
public class TestProperties {
	
	@Value("${com.ln.title}")
	private String title;
	@Value("${com.ln.name}")
	private String name;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
