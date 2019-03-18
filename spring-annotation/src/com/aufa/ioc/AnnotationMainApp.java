package com.aufa.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		GoFood orderGoFood = context.getBean("abangNasgor", GoFood.class);
		
		// call a method on the bean
		System.out.println(orderGoFood.getFood());
				
		// close the context
		context.close();
		
	}

}


