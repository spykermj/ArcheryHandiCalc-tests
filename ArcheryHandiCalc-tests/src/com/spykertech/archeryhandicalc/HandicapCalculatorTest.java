package com.spykertech.archeryhandicalc;

import junit.framework.TestCase;

public class HandicapCalculatorTest extends TestCase {
	public void testConvertYardsToMeters() throws Exception {
		double oneHundredYardsAsMeters = 91.44;
		
		assertEquals(oneHundredYardsAsMeters, HandicapCalculator.yardsToMeters(100.0), 0.00000001);
	}
	
	public void testGetRMS() throws Exception {
		double precision = 0.00001;
		double oneHundredYardsHcapZero = 7.330498;
		double oneHundredYardsHcapForty = 36.79815;
		double ninetyMetersHcapZero = 7.21151;
		double ninetyMetersHcapForty = 36.00009;
		
		assertEquals(oneHundredYardsHcapZero, HandicapCalculator.getRMS(0, 100, true), precision);
		assertEquals(oneHundredYardsHcapForty, HandicapCalculator.getRMS(40, 100, true), precision);
		assertEquals(ninetyMetersHcapZero, HandicapCalculator.getRMS(0, 90, false), precision);
		assertEquals(ninetyMetersHcapForty, HandicapCalculator.getRMS(40, 90, false), precision);
	}
}
