package com.cg.recursion;

import java.util.Scanner;

public class FibonacciSeries {

		static int Fibo(int n)
		{
			if(n==0)
			{
				return 0;
			}
			if(n==1)
			{
				return 1;
			}
			int ans1 = Fibo(n-1);
			int ans2 = Fibo(n-2);
			int res = ans1 + ans2;
			
			return res;
			
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner s2 = new Scanner(System.in);
			System.out.println("Enter the number:");
			int n = s2.nextInt();
			System.out.println("The Fibonacci series of " +n + " is : " +Fibo(n));
			s2.close();
		}


}
