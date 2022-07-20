package com.cg.recursion;

import java.util.Scanner;

public class SumOfDigits {
	
		static long SumDigits(long n)
		{
			if(n==0)
			{
				return 0;
				
			}
			long ans = n % 10 + SumDigits(n/10);
			return ans;
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s3 = new Scanner(System.in);
			System.out.println("Enter the number :");
			long n = s3.nextLong();
			System.out.println("The sum of digits of " +n + " is: " +SumDigits(n));
			s3.close();
		}

}
