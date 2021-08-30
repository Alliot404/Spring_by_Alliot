package com.alliot;

public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//adding new fields for email and team : injecting values
	
	private String email;
	private String team;
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		System.out.println("CricketCoach: inside setter method - setEmail");
		this.email = email;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		System.out.println("CricketCoach: inside setter method - setTeam");
		this.team = team;
	}

	//create a no-arg constructor
	public CricketCoach() {
		System.out.println("CricketCoach: inside a no-arg constructor");
	}

	//setter method :for setter injection
	
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService (by setter injection)");
		this.fortuneService = fortuneService;
	}



	public String getDailyworkout() {
		
		return "Cricket Coach says: Lets do practice for tommarow's match (by inversion of control)";
	}

	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyFortune2() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
