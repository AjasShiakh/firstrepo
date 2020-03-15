package com.byName;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("/com/byName/beanByName.xml");
		Teacher t1=apc.getBean("t",Teacher.class);
		
		  System.out.println(t1);
		
	}
	
}
