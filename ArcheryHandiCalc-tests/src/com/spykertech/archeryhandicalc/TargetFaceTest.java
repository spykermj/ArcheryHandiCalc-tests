package com.spykertech.archeryhandicalc;

import junit.framework.TestCase;

public class TargetFaceTest extends TestCase {
	public void testDiameters() throws Exception {
		assertEquals(122.0, TargetFace.FITA122.getDiameter());
		assertEquals(80.0, TargetFace.FITA80.getDiameter());
		assertEquals(40.0, TargetFace.FITA40.getDiameter());
		assertEquals(40.64, TargetFace.WORCESTER.getDiameter());
		assertEquals(40.0, TargetFace.VEGAS.getDiameter());
	}
}
