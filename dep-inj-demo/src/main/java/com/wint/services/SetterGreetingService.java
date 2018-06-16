package com.wint.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService {
	
	/* (non-Javadoc)
	 * @see com.wint.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Hello, I was injected by the setter!";
	}

}
