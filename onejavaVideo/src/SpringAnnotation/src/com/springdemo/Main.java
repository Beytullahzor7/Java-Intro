package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(IocConfig.class); //config dosyas�n� belirttik
	    
		ICustomerService customerService = context.getBean("service",ICustomerService.class);
		

		customerService.add();
		
	}
	
	//IoC - Inversion of Control
	//Dependency Injection
	//Spagetti
	//SOLID

}
