package com.alliot.annotationdemo;

import org.springframework.stereotype.Component;

@Component
public class Practice5Fortune implements FortuneService {

	@Override
	public String getFortune() {
		
		return null;
	}

	@Override
	public String getPractice5Fortune() {
		// TODO Auto-generated method stub
		return "Practice5: new implementation for fortune with di";
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
