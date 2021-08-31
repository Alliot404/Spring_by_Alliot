package com.alliot.annotationdemo;

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

}
