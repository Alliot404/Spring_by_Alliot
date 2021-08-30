package com.alliot;

public class BaseballCoach implements Coach {
	
	//Inversion control
		public String getDailyworkout() {
			return "Baseball Coack says: Spend 30 min on batting practice (by inversion of control)";
		}
	
	//define a private field for the dependency
	private FortuneService fortuneService;
	
	
	//define a constructor for dependency injection : constructor injection
	public BaseballCoach(FortuneService theFortuneService) {
		
		fortuneService = theFortuneService;
	}
	
	
	public String getDailyFortune() {
		
		//use my fortuneService to get a fortune
		
		return fortuneService.getFortune();
	}


	@Override
	public String getDailyFortune2() {
		// TODO Auto-generated method stub
		return null;
	}

}
