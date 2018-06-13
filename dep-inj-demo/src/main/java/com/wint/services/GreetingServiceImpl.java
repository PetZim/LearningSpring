package com.wint.services;

/**
 * This is class is part of Dependency-Injection-without-Spring example.
 * 
 * @author peter
 *
 */
public class GreetingServiceImpl implements GreetingService {
	
	public static final String HELLO = "Hello, World!";
	
	@Override
	public String sayGreeting() {
		return HELLO;
	}
}
