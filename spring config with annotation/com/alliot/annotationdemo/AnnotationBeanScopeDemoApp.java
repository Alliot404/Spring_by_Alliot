package com.alliot.annotationdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		
		//read spring configuration file
				ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
				
				//get bean from container
				Coach  theCoach = context.getBean("tennisCoach", Coach.class);  
				
				Coach  alphaCoach = context.getBean("tennisCoach", Coach.class); 
				
				boolean result = (theCoach==alphaCoach);
				
				System.out.println("\nBoth beans are pointing to same location: " + result);
				
				System.out.println("\nLocation of theCoach: " + theCoach);
				
				System.out.println("\nLocation of aplhaCoach: " + alphaCoach);
				
				//close context
				context.close();

	}

}
