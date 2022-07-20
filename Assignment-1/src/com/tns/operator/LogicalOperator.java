package com.tns.operator;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s3 = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int a = s3.nextInt();
		System.out.println("Enter the second value :");
		int b = s3.nextInt();
		boolean res = (a<b && b<8);
		boolean res1 = (a<b || b<8);
		boolean res2 = !(a<b);
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		s3.close();


	}

}
