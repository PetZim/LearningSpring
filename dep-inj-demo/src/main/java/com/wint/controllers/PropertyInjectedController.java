/**
 * 
 */
package com.wint.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
	@Qualifier("greetingServiceImpl") // <- when not specified @Primary service is used 
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
