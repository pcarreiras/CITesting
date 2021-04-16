package com.agora.cicdtests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


import java.io.IOException;

import org.junit.Ignore;
import org.junit.Test;


public class GreetingControllerTest {


	@Test
	public void sayHello() throws IOException {
		GreetingController greetingController = new GreetingController();
		assertEquals(greetingController.sayHello(), "Hello world");
	}

	@Test
	@Ignore
	public void fails() throws IOException {
		assertTrue(false);
	}



}