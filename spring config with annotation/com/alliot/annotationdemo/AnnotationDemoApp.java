package com.alliot.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		Coach  theCoach = context.getBean("thatSillyCoach", Coach.class);	
		
		//call the method
		System.out.println(theCoach.getDailyWorkout());
		
		//close context
		context.close();

	}

}
