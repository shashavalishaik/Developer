package com.in28minutes.junit.helper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringHelperTest {
	
	StringHelper helper=new StringHelper();

	@Test
	public void testTruncateAInFirst2Positions_AinFirst2POsitions() {
	//	StringHelper helper=new StringHelper();
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		
		/*String actual=helper.truncateAInFirst2Positions("AACD");
		String expected="CD";
		assertEquals(expected,actual);*/
	}
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstPosition()
	{
	//	StringHelper helper=new StringHelper();
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));
	}
	
	
	//ABCD=> FALSE , ABAB=>TRUE, AB=>TRUE, A=>FALSE
	/*@Test
	public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenairo()
	{
		assertEquals(true,helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	
	    
		//boolean actualValue=helper.areFirstAndLastTwoCharactersTheSame("ABAB");
	    //boolean epectedValue=true;
	    //assertEquals(epectedValue,actualValue);
	}*/
	
	
	/*@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenario()
	{
		assertEquals(false,helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}*/
	
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_PositiveScenairo()
	{
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}
	
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_NegativeScenario()
	{
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
}
