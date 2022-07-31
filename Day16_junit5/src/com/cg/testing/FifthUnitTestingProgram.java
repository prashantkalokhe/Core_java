package com.cg.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assume.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class FifthUnitTestingProgram {
	
	@Test
	@Disabled
	void trueAssumption()
	{
		assumeTrue(5>1);
		assertEquals(5+2,7);
	}
	@Test
	@Disabled
	void falseAssumption()
	{
		assumeFalse(5<1);
		assertEquals(5+2,7);
	}
	@Test
	void assumeThat()
	{
		String str = "Onkar";
		assumingThat(str.equals("gra"),()->assertEquals(2+3,5));
	}
}