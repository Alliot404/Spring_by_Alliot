package com.alliot.annotationdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		
		return "swim coach says: swim 100m a warm up..";
	}
	
	

	public String getEmail() {
		return email;
	}

	public String getTeam() {
		return team;
	}

	
	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getPractice5Fortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIOCandDiPractice7() {
		// TODO Auto-generated method stub
		return null;
	}

}
