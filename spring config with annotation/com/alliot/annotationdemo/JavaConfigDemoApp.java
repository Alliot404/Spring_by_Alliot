package com.alliot.annotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
		//read spring configuration file with java configuration
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(SportConfig.class);
		
		System.out.println("Configuration with java...");
		
		//get bean from container
		Coach  theCoach = context.getBean("tennisCoach", Coach.class);  
		//to achieve inversion of control by annotation just change the default bean id as show below commented code
		
		Coach theCricketCoach = context.getBean("cricketCoach", Coach.class);
		
		//call the method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCricketCoach.getDailyWorkout());
		
		System.out.println(theCricketCoach.getPractice5Fortune());
		
		//call new method to get dailyFortune
		System.out.println(theCoach.getDailyFortune());
		
		//close context
		context.close();  

	}

}
