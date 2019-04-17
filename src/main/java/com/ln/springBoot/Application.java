package com.ln.springBoot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *  项目启动入口
 *  
 *  @SpringBootApplication注解：
 *  	标识这是一个 Spring Boot 应用，用来开启 Spring Boot 的各项能力。
 * @author linan  
 * @date 2019年4月9日  
 * @version 1.0
 */
@SpringBootApplication
@MapperScan("com.ln.springBoot.web.dao")
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
