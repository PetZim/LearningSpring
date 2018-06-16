package com.wint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wint.services.GreetingService;
import com.wint.services.GreetingServiceImpl;

@Controller
public class SetterInjectedController {
	private GreetingService greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
	// HERE IS THE INJECTION
	@Autowired // Spring Injection
	public void setGreetingService(GreetingService greetingService) {
		this.greetingService = greetingService;
	}
}
