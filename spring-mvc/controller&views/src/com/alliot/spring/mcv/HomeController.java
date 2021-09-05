package com.alliot.spring.mcv;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String showMyPage() {
		return "main-menu";
	}
	@RequestMapping("abhi")
	public String showMyPage2() {
		return "abhi";
	}
}
