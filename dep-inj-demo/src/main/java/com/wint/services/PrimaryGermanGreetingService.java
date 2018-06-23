/**
 * 
 */
package com.wint.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author peter
 *
 */
// Moved to GreetingServiceConfig.java
//@Service
//@Primary
//@Profile("de")
public class PrimaryGermanGreetingService implements GreetingService {

	private GreetingRepository greetingRepository;
	
	public PrimaryGermanGreetingService(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}

	/* (non-Javadoc)
	 * @see com.wint.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Das ist ein PrimaryGermanGreetingService!";
	}

}
