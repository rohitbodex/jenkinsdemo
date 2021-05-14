package com.bodex;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DemoTest {

	@Test
	public void factTest() {
		Demo demo = new Demo();
		
		assertEquals(24,demo.factorial(4));
	}
	
}
