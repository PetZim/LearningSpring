/**
 * 
 */
package com.wint.controllers;

import com.wint.services.GreetingServiceImpl;

/**
 * This is class is part of Dependency-Injection-without-Spring example.
 * 
 * @author peter
 *
 */
public class PropertyInjectedController {
	// INJECTION
	public GreetingServiceImpl greetingService;
	
	String sayHello() {
		return greetingService.sayGreeting();
	}
	
/*
	public GreetingServiceImpl getGreetingService() {
		return greetingService;
	}
*/
}
