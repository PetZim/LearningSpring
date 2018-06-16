/**
 * 
 */
package com.wint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.wint.services.GreetingServiceImpl;

/**
 * 
 * @author peter
 *
 */
@Controller
public class PropertyInjectedController {
	@Autowired // SPRING Injection
	public GreetingServiceImpl greetingService;
	
	public String sayHello() {
		return greetingService.sayGreeting();
	}
	
/*
	public GreetingServiceImpl getGreetingService() {
		return greetingService;
	}
*/
}
