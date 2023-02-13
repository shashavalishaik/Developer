package com.junitproj;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculationTest {

	@Test
	void testFindMax()
	{
		assertEquals(-1,Calculation.findMax(new int[]{-1,-3,-4,-2}));
		
		
	}

}
