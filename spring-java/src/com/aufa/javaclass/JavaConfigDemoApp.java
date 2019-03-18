package com.aufa.javaclass;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

		// read spring config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(GoFoodConfig.class);
		
		// get the bean from spring container
		GoFood orderGoFood = context.getBean("NasiGoreng", GoFood.class);
		
		// call a method on the bean
		System.out.println(orderGoFood.getFood());
					
		// close the context
		context.close();
		
	}

}


