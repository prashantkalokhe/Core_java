package com.capgemini.intro;

public class MangoTreeProblem {
	public static void main(String[] args)
	{
		int r=5;
		int c=5;
		int n=20;
		
		if(r*2 == n || r*(c-1) == n)
		{
			System.out.println("It is a Mango Tree");
		}
		else
		{
			System.out.println("It is not a Mango Tree");	
		}
	}

}
