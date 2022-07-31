package com.cg.testing;

//Program on assertions.

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FourthUnitTestingProgram {
	
	@Test
	void display()
	{
		int arr[] = {1,2,3,4,5};
		//assertEquals method will check whether the two parameters values are same or not.
		//If it is same then then you will not get any failure otherwise you will get failure.
		assertAll("arr",()->assertEquals(arr[1],2));
	}
}