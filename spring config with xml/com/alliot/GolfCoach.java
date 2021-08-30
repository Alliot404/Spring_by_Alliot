package com.alliot;

public class GolfCoach implements Coach {
	
	private FortuneService2 fortuneService2;


	public GolfCoach(FortuneService2 theFortuneService2) {
		fortuneService2 = theFortuneService2;
	}
	

	@Override
	public String getDailyFortune2() {
		return fortuneService2.getFortune2();
	}


	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
