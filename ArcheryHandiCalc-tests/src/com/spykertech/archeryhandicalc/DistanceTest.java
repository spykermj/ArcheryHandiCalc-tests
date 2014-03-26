package com.spykertech.archeryhandicalc;

import junit.framework.TestCase;

public class DistanceTest extends TestCase {
	public void testGetHandicapScore() throws Exception {
		Distance portsmouth = new Distance(20, TargetFace.FITA60, ScoringStyle.TEN_ZONE, false, 60);
		double expectedScore = HandicapCalculator.getFITATenZoneAverageScore(40, 20, 60, false) * 60.0;
		assertEquals(expectedScore, portsmouth.getHandicapScore(40));
		expectedScore = HandicapCalculator.getFITAFiveZoneAverageScore(35, 20, 60, false) * 60.0;
		portsmouth = new Distance(20, TargetFace.FITA60, ScoringStyle.FIVE_ZONE, false, 60);
		assertEquals(expectedScore, portsmouth.getHandicapScore(35));
		expectedScore = HandicapCalculator.getFiveZoneInnerTenAverageScore(31, 20, 60, false) * 60.0;
		portsmouth = new Distance(20, TargetFace.FITA60, ScoringStyle.FIVE_ZONE_COMPOUND, false, 60);
		assertEquals(expectedScore, portsmouth.getHandicapScore(31));
		expectedScore = HandicapCalculator.getImperialAverageScore(31, 20, 60, false) * 60.0;
		portsmouth = new Distance(20, TargetFace.FITA60, ScoringStyle.IMPERIAL, false, 60);
		assertEquals(expectedScore, portsmouth.getHandicapScore(31));
		expectedScore = HandicapCalculator.getFITAInnerTenAverageScore(31, 20, 60, false) * 60.0;
		portsmouth = new Distance(20, TargetFace.FITA60, ScoringStyle.TEN_ZONE_COMPOUND, false, 60);
		assertEquals(expectedScore, portsmouth.getHandicapScore(31));
		expectedScore = HandicapCalculator.getWorcesterAverageScore(31, 20, 60, false) * 60.0;
		portsmouth = new Distance(20, TargetFace.FITA60, ScoringStyle.WORCESTER, false, 60);
		assertEquals(expectedScore, portsmouth.getHandicapScore(31));
	}
	
	public void testGetMaxScore() throws Exception {
		Distance portsmouth = new Distance(20, TargetFace.FITA60, ScoringStyle.TEN_ZONE, false, 60);
		int expectedMaxScore = 600;
		assertEquals(expectedMaxScore, portsmouth.getMaxScore());
	}
}
