package com.junitproj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GreetingImplTest {

	@Test
	public void greetShouldReturnValidOutput (){
		Greeting greeting=new GreetingImpl();
		String result=greeting.greet("junit");
		assertNotNull(result);
		assertEquals("Hellojunit",result);
		
	}
	
	@Test
	public void greetShouldThrowAnException()
	{
		Greeting greeting=new GreetingImpl();
		greeting.greet("junit");
	}

}
