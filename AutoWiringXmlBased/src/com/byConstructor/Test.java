package com.byConstructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext apc=new ClassPathXmlApplicationContext("/com/byConstructor/NewFile.xml");
		  Airlince ar=apc.getBean("a",Airlince.class);
		  System.out.println(ar);
	}
	
}
