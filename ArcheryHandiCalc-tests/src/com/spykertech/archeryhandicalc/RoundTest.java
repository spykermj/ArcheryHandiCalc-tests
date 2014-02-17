package com.spykertech.archeryhandicalc;

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
}
