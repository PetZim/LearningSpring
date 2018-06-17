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
@Service
@Profile("sk")
@Primary
public class PrimarySlovakGreetingService implements GreetingService {

	/* (non-Javadoc)
	 * @see com.wint.services.GreetingService#sayGreeting()
	 */
	@Override
	public String sayGreeting() {
		return "Toto je PrimarySlovakGreetingService";
	}

}
