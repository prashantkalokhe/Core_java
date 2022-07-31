package com.cg.testing;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SecondUnitTestingProgram {
	
	@Test
	@BeforeAll
	static void display()
	{
		System.out.println("@BeforeAll - Executes once before all the test methods in this class");
	}
	@Test
	@BeforeEach
	void display1()
	{
		System.out.println("BeforeEach - Executes before each test method in this class");
	}
	
	@Test
	void print()
	{
		System.out.println("Hello guys");
	}
	@Test
	void print1()
	{
		System.out.println("Hello Folks");
	}
}