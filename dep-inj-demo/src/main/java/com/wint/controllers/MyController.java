package com.wint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.wint.services.GreetingService;

@Controller
public class MyController {
	
	private GreetingService greetingService;
	
	@Autowired
	public MyController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}



	public String sayHello() {
		return greetingService.sayGreeting();
	}
}
