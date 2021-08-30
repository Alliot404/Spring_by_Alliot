package com.alliot.annotationdemo;

import org.springframework.stereotype.Component;

@Component //default bean id creation: same name as class with 1st letter lowerCase
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Tennis Coach says: Practice your backhand volley..        (by annotation)";
	}

}
