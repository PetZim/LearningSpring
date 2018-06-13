package com.wint.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wint.services.GreetingServiceImpl;

public class SetterInjectedControllerTest {
	private SetterInjectedController sic;
	
	@Before
	public void setUp() throws Exception {
		this.sic = new SetterInjectedController();
		this.sic.setGreetingService(new GreetingServiceImpl());
	}
	
	@Test
	public void test() {
		assertEquals(GreetingServiceImpl.HELLO, sic.sayHello());
	}

}
