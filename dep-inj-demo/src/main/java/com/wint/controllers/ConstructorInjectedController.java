package com.wint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import com.wint.services.GreetingService;

/**
 * 
 * @author peter
 *
 */
@Controller
public class ConstructorInjectedController {
	private GreetingService greetingService;

	// Spring automatically Autowires and injects dependency
	@Autowired // <- no need to do this, but it's a good habit
	public ConstructorInjectedController(
			@Qualifier("constructorGreetingService") GreetingService greetingService) {
		super();
		this.greetingService = greetingService;
	}
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}

}
