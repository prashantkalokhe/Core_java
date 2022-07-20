package com.tns.operator;

import java.util.Scanner;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s7 = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int x = s7.nextInt();
		System.out.println("Enter the second value:");
		int y = s7.nextInt();
		System.out.println("The multiplication of two numbers is :" +x*y);
		s7.close();

	}

}
