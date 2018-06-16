/**
 * 
 */
package com.wint.services;

import org.springframework.stereotype.Service;

/**
 * @author peter
 *
 */
@Service
public class ConstructorGreetingService implements GreetingService {

	/* (non-Javadoc)
	 * @see com.wint.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Hello I was injected by the Construcor!";
	}

}
