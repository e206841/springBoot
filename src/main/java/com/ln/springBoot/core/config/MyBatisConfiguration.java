package com.ln.springBoot.core.config;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.github.pagehelper.PageHelper;
/**
 * 
 * mybatis 分页插件
 * @author linan  
 * @date 2019年4月17日  
 * @version 1.0
 */
@Configuration
public class MyBatisConfiguration {
	
	@Bean
    public PageHelper pageHelper() {
		System.out.println("MyBatisConfiguration.pageHelper()");
        PageHelper pageHelper = new PageHelper();
        Properties p = new Properties();
        p.setProperty("offsetAsPageNum", "true");
        p.setProperty("rowBoundsWithCount", "true");
        p.setProperty("reasonable", "true");
        pageHelper.setProperties(p);
        return pageHelper;
    }
}
