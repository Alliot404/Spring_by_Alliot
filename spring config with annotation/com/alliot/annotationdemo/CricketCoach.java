package com.alliot.annotationdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //default bean id creation: same name as class with 1st letter lowerCase
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkout() {

		return "Cricket Coach says: practice hard today.....(by annotaion: inversion of control ";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	//practice5 new implementation for fortune service with dependency injection with auto-wired field annotation
	@Autowired
	private FortuneService practice5Fortune;
	
	@Override
	public String getPractice5Fortune() {
		
		return practice5Fortune.getPractice5Fortune() ;
	}
	
	public CricketCoach() {
		System.out.println(">>Inside  default constructor..");
	}

}
