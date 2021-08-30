package com.alliot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//retrieve bean from spring container
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		
		//call methods on the bean
		System.out.println(theCoach.getDailyworkout());
		
		System.out.println(theCoach.getDailyFortune());
		
		//call new methods to get values
		System.out.println("Email is: " + theCoach.getEmail());
		
		System.out.println("Teams is :" + theCoach.getTeam());
		
		
		//close context
		context.close();

	}

}
