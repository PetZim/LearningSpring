/**
 * 
 */
package com.wint.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @author peter
 *
 */
@Service
@Primary
public class PrimaryGreetingService implements GreetingService {

	/* (non-Javadoc)
	 * @see com.wint.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Hello, from the Primary  Greeting Service!";
	}

}
