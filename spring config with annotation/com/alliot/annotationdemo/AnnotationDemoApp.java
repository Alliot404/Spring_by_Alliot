package com.alliot.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from container
		Coach  theCoach = context.getBean("tennisCoach", Coach.class);  
		//to achieve inversion of control by annotation just change the default bean id as show below commented code
		
		Coach theCricketCoach = context.getBean("cricketCoach", Coach.class);
		
		//call the method
		System.out.println(theCoach.getDailyWorkout());
		
		System.out.println(theCricketCoach.getDailyWorkout());
		
		
		//call new method to get dailyFortune
		System.out.println(theCoach.getDailyFortune());
		
		if(theCoach.getRandomFortune()==null) {
			System.out.println("@qualifier annotation is added to above happy fortune service so this getRandomFortune is null");
			System.out.println(theCoach.getRandomFortune());
		}
		else {
			System.out.println("@qualifier annotation is added to getRandomFortune so this getDailyFortune is null");
			System.out.println(theCoach.getRandomFortune());
		}
		
		System.out.println(theCricketCoach.getPractice5Fortune());
		
		//close context
		context.close();  

	}

}
