package com.aufa.ioc;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {

		// load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		// retrieve bean from spring container
		GoFood orderGoFood = context.getBean("myFood", GoFood.class);
		
		// call methods on the bean
		System.out.println(orderGoFood.getFood());
		
		// close the context
		context.close();
	}

}







