package com.agora.cicdtests;

import static org.junit.Assert.assertEquals;


import java.io.IOException;

import org.junit.Test;


public class GreetingControllerTest {


	@Test
	public void sayHello() throws IOException {
		GreetingController greetingController = new GreetingController();
		assertEquals(greetingController.sayHello(), "Hello again");
	}


}