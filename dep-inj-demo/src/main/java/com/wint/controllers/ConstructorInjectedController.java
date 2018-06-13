package com.wint.controllers;

import com.wint.services.GreetingService;

/**
 * This is class is part of Dependency-Injection-without-Spring example.
 * 
 * @author peter
 *
 */
public class ConstructorInjectedController {
	private GreetingService greetingService;

	// INJECTION
	public ConstructorInjectedController(GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	String sayHello() {
		return greetingService.sayGreeting();
	}

}
