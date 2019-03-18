package com.aufa.javaclass;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationMainApp {

	public static void main(String[] args) {

		// read spring config file
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// get the bean from spring container
		GoFood theCoach = context.getBean("NasiGoreng", GoFood.class);
		
		// call a method on the bean
		System.out.println(theCoach.getFood());

				
		// close the context
		context.close();	
	}

}


