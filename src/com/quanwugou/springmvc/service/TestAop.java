package com.quanwugou.springmvc.service;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.quanwugou.springmvc.service.impl.TestServiceImpl;

public class TestAop {

	@Test
	public void test() {
		 ApplicationContext ctx = new ClassPathXmlApplicationContext("ApplicationContext-mvc.xml");  
		 TestServiceImpl bean = (TestServiceImpl)ctx.getBean("testServiceImpl");  
	     bean.save(null);  
	}

}
