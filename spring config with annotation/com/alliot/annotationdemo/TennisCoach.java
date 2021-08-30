package com.alliot.annotationdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCoach")  //acts as bean id
public class TennisCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Tennis Coach says: Practice your backhand volley..        (by annotation)";
	}

}
