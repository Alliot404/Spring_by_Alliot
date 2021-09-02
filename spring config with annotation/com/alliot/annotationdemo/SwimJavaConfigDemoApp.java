package com.alliot.annotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring configuration file with java configuration
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		System.out.println("Configuration with java...");
		
		//get bean from container
		SwimCoach  theCoach = context.getBean("swimCoach", SwimCoach.class);  
		
		
		//call the method
		System.out.println(theCoach.getDailyWorkout());

		
		//call new method to get dailyFortune
		System.out.println(theCoach.getDailyFortune());
		
		System.out.println("Emial: " + theCoach.getEmail());
		
		System.out.println("Emial: " + theCoach.getTeam());
		
		//close context
		context.close();  

	}

}
