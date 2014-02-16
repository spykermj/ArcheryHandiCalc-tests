package com.spykertech.archeryhandicalc;

import junit.framework.TestCase;

public class HandicapCalculatorTest extends TestCase {
	double precision = 0.00001;

	public void testConvertYardsToMeters() throws Exception {
		double oneHundredYardsAsMeters = 91.44;
		
		assertEquals(oneHundredYardsAsMeters, HandicapCalculator.yardsToMeters(100.0), 0.00000001);
	}
	
	public void testGetRMS() throws Exception {
		double oneHundredYardsHcapZero = 7.330498;
		double oneHundredYardsHcapForty = 36.79815;
		double ninetyMetersHcapZero = 7.21151;
		double ninetyMetersHcapForty = 36.00009;
		
		assertEquals(oneHundredYardsHcapZero, HandicapCalculator.getRMS(0, 100, true), precision);
		assertEquals(oneHundredYardsHcapForty, HandicapCalculator.getRMS(40, 100, true), precision);
		assertEquals(ninetyMetersHcapZero, HandicapCalculator.getRMS(0, 90, false), precision);
		assertEquals(ninetyMetersHcapForty, HandicapCalculator.getRMS(40, 90, false), precision);
	}
	
	public void testGetFITATenZoneAverageScore() throws Exception {
		double portsmouthOneHundredHcapAverage = 0.5737681;
		double portsmouthZeroHcapAverage = 9.995506;
		
		assertEquals(portsmouthOneHundredHcapAverage, HandicapCalculator.getFITATenZoneAverageScore(100, 20, 60, true), precision);
		assertEquals(portsmouthZeroHcapAverage, HandicapCalculator.getFITATenZoneAverageScore(0, 20, 60, true), precision);
	}
	
	public void testGetImperialAverageScore() throws Exception {
		double imperialThirtyYardsHcapZero = 9.0;
		double imperialThirtyYardsHcapThirtyNine = 8.741725;
		
		assertEquals(imperialThirtyYardsHcapZero, HandicapCalculator.getImperialAverageScore(0, 30, 122, true), precision);
		assertEquals(imperialThirtyYardsHcapThirtyNine, HandicapCalculator.getImperialAverageScore(39, 30, 122, true), precision);
	}
	
	public void testGetFITAFiveZoneAverageScore() throws Exception {
		double portsmouthZeroHcapAverage = 9.995506;
		double portsmouthThirtyHcapAverage = 9.366739;
		
		assertEquals(portsmouthZeroHcapAverage, HandicapCalculator.getFITAFiveZoneAverageScore(0, 20, 60, true), precision);
		assertEquals(portsmouthThirtyHcapAverage, HandicapCalculator.getFITAFiveZoneAverageScore(30, 20, 60, true), precision);
	}
	
	public void testGetWorsterAverageScore() throws Exception {
		double worsterZeroHcapAverage = 4.999915;
		double worsterThirtyHcapAverage = 4.654914;
		
		assertEquals(worsterZeroHcapAverage, HandicapCalculator.getWorsterAverageScore(0, 20, 40.64, true), precision);
		assertEquals(worsterThirtyHcapAverage, HandicapCalculator.getWorsterAverageScore(30, 20, 40.64, true), precision);
	}
}
