package com.wint.services;

import org.springframework.stereotype.Service;

/**
 * 
 * @author peter
 *
 */
@Service
public class GreetingServiceImpl implements GreetingService {
	
	public static final String HELLO = "Hello, World!";
	
	@Override
	public String sayGreeting() {
		return HELLO;
	}
}
