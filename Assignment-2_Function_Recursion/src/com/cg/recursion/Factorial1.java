package com.cg.recursion;

import java.util.Scanner;

public class Factorial1 {

	static int factorial1(int m)
	{
		if(m==0)
		{
			return 1;
		}
		int ans = factorial1(m-1);
		return m * ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the number :");
		int m = s1.nextInt();
		if(m<0)
		{
			System.out.println("Invalid number");
		}
		else
		{
			System.out.println("The factorial of the number is :" +factorial1(m));
			s1.close();
		}
	}
}
