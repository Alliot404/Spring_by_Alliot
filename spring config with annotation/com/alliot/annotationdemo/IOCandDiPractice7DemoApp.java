package com.alliot.annotationdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class IOCandDiPractice7DemoApp {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new 
				AnnotationConfigApplicationContext(Practice7IOCandDIConfig.class);
		
		Coach theCoach = context.getBean("iOCandDiPractice7Coach", Coach.class);
		
		System.out.println(theCoach.getIOCandDiPractice7());
		
		System.out.println(theCoach.getDailyFortune());
		
		
		
		context.close(); 

	}

}
