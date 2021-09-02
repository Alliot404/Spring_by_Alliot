package com.alliot.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //default bean id creation: same name as class with 1st letter lowerCase
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired                 //field auto-wired injection. No need of setter method
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	//setter injection by auto-wired annotation/////////////////////////
	//define default constructor
	public TennisCoach() {
		System.out.println(">>Inside  default constructor..");
	}
	
	
	
//	@Autowired                 //constructor injection with Auto-wired annotation 
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	@Override
	public String getDailyWorkout() {
		
		return "Tennis Coach says: Practice your backhand volley..        ( ioc by annotation)";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune() ;
	}
	

	@Override
	public String getPractice5Fortune() {
		// TODO Auto-generated method stub
		return fortuneService.getPractice5Fortune();
	}



	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getRandomFortune();
	}

	
	
	//define setter method for injecting
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">>Inside  setFortuneService ..(di: setter method by autowired annotation)");
//		this.fortuneService = fortuneService;
//	}
	

}
