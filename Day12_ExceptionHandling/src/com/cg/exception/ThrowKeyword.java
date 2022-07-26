package com.cg.exception;

//Throw keyword
//It is used to throw an exception explicitly.
public class ThrowKeyword {
	public static void validate(int age)
	{
		if(age<17 || age>24)
			throw new ArithmeticException("Not eligible");
		else
			System.out.println("Eligible to attend Military selection");
	}

	public static void main(String[] args) {
		try
		{
			validate(30);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		System.out.println("....rest of the code");
	}
}