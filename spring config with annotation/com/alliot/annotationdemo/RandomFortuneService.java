package com.alliot.annotationdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of strings
	private String[] data = {"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"};
	
	// create a random number generator
		private Random myRandom = new Random();

	@Override
	public String getRandomFortune() {
		// pick a random string from the array
				int index = myRandom.nextInt(data.length);
				
				String theRandomFortune = data[index];
		
		return theRandomFortune;
	}

	@Override
	public String getPractice5Fortune() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
