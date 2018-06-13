package com.wint.controllers;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.wint.services.GreetingServiceImpl;

public class ConstructorInjectedControllerTest {
	private ConstructorInjectedController cic;
	
	@Before
	public void setUp() throws Exception {
		this.cic = new ConstructorInjectedController(new GreetingServiceImpl());
	}
	
	@Test
	public void test() {
		assertEquals(GreetingServiceImpl.HELLO, cic.sayHello());
	}

}
