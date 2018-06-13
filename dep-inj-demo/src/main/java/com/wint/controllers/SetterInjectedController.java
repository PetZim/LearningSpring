package com.wint.controllers;

import com.wint.services.GreetingService;
import com.wint.services.GreetingServiceImpl;

public class SetterInjectedController {
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	// HERE IS THE INJECTION
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
