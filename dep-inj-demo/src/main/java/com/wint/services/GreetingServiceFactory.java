package com.wint.services;

/**
 * 
 * @author peter
 *
 */
public class GreetingServiceFactory {
	
	private GreetingRepository greetingRepository;

	public GreetingServiceFactory(GreetingRepository greetingRepository) {
		super();
		this.greetingRepository = greetingRepository;
	}
	
	public GreetingService createGreetingService(String lang) {
		switch (lang) {
		case "de":
			return new PrimaryGermanGreetingService(greetingRepository);
		case "sk":
			return  new PrimarySlovakGreetingService(greetingRepository);
		case "en": default:
			return new PrimaryGreetingService(greetingRepository);
		}
	}
}
