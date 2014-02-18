package com.spykertech.archeryhandicalc;

import java.util.List;

import junit.framework.TestCase;

public class RoundTest extends TestCase {
	public void testGetName() throws Exception {
		String roundName = "round1";
		Round round = new Round(roundName);
		assertSame(roundName, round.getName());
	}
	
	public void testToString() throws Exception {
		String roundName = "round2";
		Round round = new Round(roundName);
		assertSame(roundName, round.toString());
	}
	
	public void testAddDistance() throws Exception {
		boolean isMeters = false;
		int arrows = 60;
		Distance dist = new Distance(20.0, TargetFace.FITA60, ScoringStyle.TEN_ZONE, isMeters, arrows);
		Round round = new Round("Portsmouth");
		round.addDistance(dist);
		List<Distance> list = round.getDistances();
		assertEquals(1, list.size());
		assertEquals(dist, list.get(0));
	}
	
	public void testGetHandicapScore() throws Exception {
		boolean isMeters = false;
		int arrows = 60;
		Distance dist = new Distance(20.0, TargetFace.FITA60, ScoringStyle.TEN_ZONE, isMeters, arrows);
		Round portsmouth = new Round("Portsmouth");
		portsmouth.addDistance(dist);
		assertEquals(541, portsmouth.getHandicapScore(37));
		Round york = new Round("York");
		dist = new Distance(100, TargetFace.FITA122, ScoringStyle.IMPERIAL, false, 72);
		york.addDistance(dist);
		dist = new Distance(80, TargetFace.FITA122, ScoringStyle.IMPERIAL, false, 48);
		york.addDistance(dist);
		dist = new Distance(60, TargetFace.FITA122, ScoringStyle.IMPERIAL, false, 24);
		york.addDistance(dist);
		assertEquals(786, york.getHandicapScore(41));
	}
	
	public void testGetHandicapTable() throws Exception {
		int[] table;
		Round york = new Round("York");
		Distance dist = new Distance(100, TargetFace.FITA122, ScoringStyle.IMPERIAL, false, 72);
		york.addDistance(dist);
		dist = new Distance(80, TargetFace.FITA122, ScoringStyle.IMPERIAL, false, 48);
		york.addDistance(dist);
		dist = new Distance(60, TargetFace.FITA122, ScoringStyle.IMPERIAL, false, 24);
		york.addDistance(dist);
		table = york.getHandicapTable();
		assertEquals(101, table.length);
		assertEquals(698, table[44]);
		assertEquals(1, table[100]);
	}
	
	public void testLookupHandicap() throws Exception {
		Round york = new Round("York");
		Distance dist = new Distance(100, TargetFace.FITA122, ScoringStyle.IMPERIAL, false, 72);
		york.addDistance(dist);
		dist = new Distance(80, TargetFace.FITA122, ScoringStyle.IMPERIAL, false, 48);
		york.addDistance(dist);
		dist = new Distance(60, TargetFace.FITA122, ScoringStyle.IMPERIAL, false, 24);
		york.addDistance(dist);
		assertEquals(41, york.lookupHandicap(792));		
	}
}
