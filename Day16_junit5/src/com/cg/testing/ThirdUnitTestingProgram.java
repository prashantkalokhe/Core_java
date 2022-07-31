package com.cg.testing;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ThirdUnitTestingProgram {

	@Test
	@DisplayName("Test is Successfully Implemented")
	void function()
	{
		System.out.println("Want to display a name");
	}
	@Test
	@DisplayName("Not Implemented")
	void function1()
	{
		System.out.println("Fails");
	}
}
//@Disabled