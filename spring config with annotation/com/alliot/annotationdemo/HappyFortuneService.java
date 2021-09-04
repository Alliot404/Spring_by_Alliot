package com.alliot.annotationdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Happy Fortune Service says: Today is your lucky day..     (dependency inejection by  autowired annotation)" ;
	}

	@Override
	public String getPractice5Fortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRandomFortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getIOCandDiPractice7Fortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
