package com.vali.junit5.hellojunit5;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;



class GreetingImpl1Test {


	@Test
	public void greetShouldReturnValidOutput (){
		Greeting1 greeting=new GreetingImpl1();
		String result=greeting.greet("junit");
		assertNotNull(result);
		assertEquals("Hellojunit",result);
		
	}
	
	@Test
	public void greetShouldThrowAnException()
	{
		Greeting1 greeting=new GreetingImpl1();
		greeting.greet("");
	}

}
