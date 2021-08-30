package com.alliot;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Fortune says: Today is your lucky day...  (dependency injection: constrcutor injection)";
	}

}
