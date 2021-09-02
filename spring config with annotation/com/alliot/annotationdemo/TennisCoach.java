package com.alliot.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //default bean id creation: same name as class with 1st letter lowerCase
public class TennisCoach implements Coach {
	
	@Autowired                 //field auto-wired injection. No need of setter method
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
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
	
	//setter injection by auto-wired annotation/////////////////////////
	//define default constructor
	public TennisCoach() {
		System.out.println(">>Inside  default constructor..");
	}

	@Override
	public String getPractice5Fortune() {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	//define setter method for injecting
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">>Inside  setFortuneService ..(di: setter method by autowired annotation)");
//		this.fortuneService = fortuneService;
//	}
	

}
