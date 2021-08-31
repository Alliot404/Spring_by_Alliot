package com.alliot.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //default bean id creation: same name as class with 1st letter lowerCase
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Autowired                 //constructor injection with Auto-wired annotation 
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Tennis Coach says: Practice your backhand volley..        (by annotation)";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune() ;
	}

}
