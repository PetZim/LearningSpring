package com.wint.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wint.services.GreetingServiceImpl;

public class PropertyInjectedControllerTest {

	private PropertyInjectedController pic;
	
	@Before
	public void setUp() throws Exception {
		this.pic = new PropertyInjectedController();
		this.pic.greetingService = new GreetingServiceImpl();
	}
	
	@Test
	public void testGreeting() {
		assertEquals(GreetingServiceImpl.HELLO, pic.sayHello());
	}

}
