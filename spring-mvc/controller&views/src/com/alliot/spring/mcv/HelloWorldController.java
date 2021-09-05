package com.alliot.spring.mcv;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	//need a controller method to show the initial html form
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	//need controller method to process the html form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//new controller method to read form data and add data to the model
	@RequestMapping("/processFormV2")
	public String letsShout(HttpServletRequest request, Model model) {
		//read request parameters from the html form
		String theName = request.getParameter("studentName");
		
		//convert data to all caps
		theName = theName.toUpperCase();
		
		//create message
		String result = "Yo..! " + theName;
		
		
		//add message to the model
		model.addAttribute("message", result);
		
		
		return "helloworld";
	}

}
