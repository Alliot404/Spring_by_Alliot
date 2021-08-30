package com.alliot;

public class TrackCoach implements Coach {
	
	private FortuneService fortuneService;

	
	public TrackCoach(FortuneService fortuneService) {
		super();
		this.fortuneService = fortuneService;
	}

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDailyworkout() {
		// TODO Auto-generated method stub
		return "Track Coack says: Run a hard 5k";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return "Just Do It: " + fortuneService.getFortune();
	}

	@Override
	public String getDailyFortune2() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
