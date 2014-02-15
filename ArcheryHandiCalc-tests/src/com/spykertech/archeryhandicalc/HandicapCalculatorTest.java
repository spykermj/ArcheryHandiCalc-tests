package com.spykertech.archeryhandicalc;

import junit.framework.TestCase;

public class HandicapCalculatorTest extends TestCase {
	public void testConvertYardsToMeters() throws Exception {
		double oneHundredYardsAsMeters = 91.44;
		
		assertEquals(oneHundredYardsAsMeters, HandicapCalculator.yardsToMeters(100.0), 0.00000001);
	}
}
