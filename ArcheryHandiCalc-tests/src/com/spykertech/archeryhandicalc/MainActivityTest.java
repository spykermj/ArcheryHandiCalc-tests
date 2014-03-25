package com.spykertech.archeryhandicalc;

import java.util.List;

import junit.framework.TestCase;

public class MainActivityTest extends TestCase {
	public void testBuildRoundList() throws Exception {
		MainActivity activity = new MainActivity();
		List<Round> list = activity.buildRoundList();
		for(Round round : list) {			
			if(round.toString() == "Vegas") {
				int expectedHandicap = 47;
				assertEquals(expectedHandicap, round.lookupHandicap(400));
				expectedHandicap = 100;
				assertEquals(expectedHandicap, round.lookupHandicap(8));
			}
			
			if(round.toString() == "Portsmouth") {
				int expectedHandicap = 1;
				assertEquals(expectedHandicap, round.lookupHandicap(600));
			}
		}
	}
}
