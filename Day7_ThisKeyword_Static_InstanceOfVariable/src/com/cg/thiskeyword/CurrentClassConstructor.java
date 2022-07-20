package com.cg.thiskeyword;

//this keyword is used to invoke current class constructor.
public class CurrentClassConstructor {
		String s;
		CurrentClassConstructor()
		{
			this("Onkar");
			System.out.println("Inside default constructor \n");
		}
		CurrentClassConstructor(String s)
		{
			this.s = s;
			System.out.println("Inside Parameterized constructor");
	}
	public static void main(String[] args) {
		CurrentClassConstructor c = new CurrentClassConstructor();
	}
}