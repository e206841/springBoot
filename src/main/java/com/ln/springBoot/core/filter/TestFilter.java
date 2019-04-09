package com.ln.springBoot.core.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.springframework.context.annotation.Configuration;

import ch.qos.logback.classic.selector.servlet.ContextDetachingSCL;
/**
 * 自定义filter
 *	 实现自定义filter:
 *			1.实现Filter
 *			2.使用@Configuration注解
 * @author linan  
 * @date 2019年4月9日  
 * @version 1.0
 */
@Configuration
public class TestFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("TestFilter...destroy...");
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req=(HttpServletRequest) request;
		String requestURI = req.getRequestURI();
		System.out.println(requestURI);
		chain.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("TestFilter...init...");
	}

}
