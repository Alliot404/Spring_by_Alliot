package com.alliot;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// load the spring configuration file
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// retrieve bean from spring container
				Coach theCoach = context.getBean("myGolfCoach", Coach.class);
				
				// call methods on the bean
				
				System.out.println(theCoach.getDailyFortune2());
				
				// close the context
				context.close();
 
	}

}
