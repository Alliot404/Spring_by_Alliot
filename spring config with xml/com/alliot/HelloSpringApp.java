package com.alliot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		//load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach  theCoach = context.getBean("myCoach", Coach.class);	
		
//		Coach  theCoach2 = context.getBean("CricketCoach", Coach.class);
		
		//call methods on the bean 
		System.out.println(theCoach.getDailyworkout());
		
//		System.out.println(theCoach2.getDailyworkout());
		
		//lets call our new method for fortune
		System.out.println(theCoach.getDailyFortune());
		
		
		//close the context
		context.close();

	}

}
