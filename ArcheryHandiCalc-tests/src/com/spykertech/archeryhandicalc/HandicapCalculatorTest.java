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
		
		assertEquals(oneHundredYardsHcapZero, HandicapCalculator.getRMS(0, 100, false), precision);
		assertEquals(oneHundredYardsHcapForty, HandicapCalculator.getRMS(40, 100, false), precision);
		assertEquals(ninetyMetersHcapZero, HandicapCalculator.getRMS(0, 90, true), precision);
		assertEquals(ninetyMetersHcapForty, HandicapCalculator.getRMS(40, 90, true), precision);
	}
	
	public void testGetFITATenZoneAverageScore() throws Exception {
		double portsmouthOneHundredHcapAverage = 0.5737681;
		double portsmouthZeroHcapAverage = 9.995506;
		
		assertEquals(portsmouthOneHundredHcapAverage, HandicapCalculator.getFITATenZoneAverageScore(100, 20, 60, false), precision);
		assertEquals(portsmouthZeroHcapAverage, HandicapCalculator.getFITATenZoneAverageScore(0, 20, 60, false), precision);
	}
	
	public void testGetImperialAverageScore() throws Exception {
		double imperialThirtyYardsHcapZero = 9.0;
		double imperialThirtyYardsHcapThirtyNine = 8.741725;
		
		assertEquals(imperialThirtyYardsHcapZero, HandicapCalculator.getImperialAverageScore(0, 30, 122, false), precision);
		assertEquals(imperialThirtyYardsHcapThirtyNine, HandicapCalculator.getImperialAverageScore(39, 30, 122, false), precision);
	}
	
	public void testGetFITAFiveZoneAverageScore() throws Exception {
		double portsmouthZeroHcapAverage = 9.995506;
		double portsmouthThirtyHcapAverage = 9.366739;
		double portsmouthOneHundredHcapAverage = 0.2822151;
		
		assertEquals(portsmouthZeroHcapAverage, HandicapCalculator.getFITAFiveZoneAverageScore(0, 20, 60, false), precision);
		assertEquals(portsmouthThirtyHcapAverage, HandicapCalculator.getFITAFiveZoneAverageScore(30, 20, 60, false), precision);
		assertEquals(portsmouthOneHundredHcapAverage, HandicapCalculator.getFITAFiveZoneAverageScore(100, 20, 60, false), precision);
	}
	
	public void testGetWorsterAverageScore() throws Exception {
		double worsterZeroHcapAverage = 4.999915;
		double worsterThirtyHcapAverage = 4.654914;
		
		assertEquals(worsterZeroHcapAverage, HandicapCalculator.getWorcesterAverageScore(0, 20, 40.64, false), precision);
		assertEquals(worsterThirtyHcapAverage, HandicapCalculator.getWorcesterAverageScore(30, 20, 40.64, false), precision);
	}
	
	public void testGetFITAInnerTenAverageScore() throws Exception {
		double compoundPortsmouthZeroHcapAverage = 9.808701;
		double compoundPortsmouth30HcapAverage = 9.071339;

		assertEquals(compoundPortsmouthZeroHcapAverage, HandicapCalculator.getFITAInnerTenAverageScore(0, 20, 60, false), precision);
		assertEquals(compoundPortsmouth30HcapAverage, HandicapCalculator.getFITAInnerTenAverageScore(30, 20, 60, false), precision);
	}
	
	public void testGetFiveZoneInnerTenAverageScore() throws Exception {
		double compoundPortsmouthZeroHcapAverage = 9.808701;
		double compoundPortsmouth30HcapAverage = 9.071332;

		assertEquals(compoundPortsmouthZeroHcapAverage, HandicapCalculator.getFiveZoneInnerTenAverageScore(0, 20, 60, false), precision);
		assertEquals(compoundPortsmouth30HcapAverage, HandicapCalculator.getFiveZoneInnerTenAverageScore(30, 20, 60, false), precision);
	}
}
