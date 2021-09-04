package com.alliot.annotationdemo;

public class IOCandDiPractice7Coach implements Coach {
	
	
	private FortuneService fortuneService;
	
	
	public IOCandDiPractice7Coach(FortuneService fortuneService) {
		
		this.fortuneService = fortuneService;
	}


	@Override
	public String getIOCandDiPractice7() {
		
		return "practice7 says: practice IOC and DI by java code configuration";
	}

	
	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getIOCandDiPractice7Fortune();
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



}
