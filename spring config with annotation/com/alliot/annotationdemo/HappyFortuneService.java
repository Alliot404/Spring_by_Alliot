package com.alliot.annotationdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "Fortune Service says: Today is your lucky day..     (dependency injection by annotation & autowired)" ;
	}

}
