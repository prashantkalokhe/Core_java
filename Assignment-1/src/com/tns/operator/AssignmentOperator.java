package com.tns.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//multiplication
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int a = s2.nextInt();
		System.out.println("Enter the second value :");
		int b = s2.nextInt();
		a*=b;
		System.out.println("The value is : " +a);
		s2.close();
	}

}
