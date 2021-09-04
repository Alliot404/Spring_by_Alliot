package com.alliot.annotationdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.alliot.annotationdemo")
public class Practice7IOCandDIConfig {
	
	// define bean for our iOCandDiPractice7FortuneService()
	@Bean
	public FortuneService iOCandDiPractice7FortuneService() {
		return new IOCandDiPractice7FortuneService();
	}
	
	@Bean
	public FortuneService sadFortuneService() {  //here bean id is sadFortuneService will be created
		return new SadFortuneService();
	}
	
	// define bean for our iOCandDiPractice7Coach AND inject dependency
	@Bean
	public Coach iOCandDiPractice7Coach() {
		return new IOCandDiPractice7Coach(iOCandDiPractice7FortuneService() );
	}
	
	
	
}
