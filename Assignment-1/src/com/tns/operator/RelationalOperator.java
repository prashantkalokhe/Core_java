package com.tns.operator;

import java.util.Scanner;

public class RelationalOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		System.out.println("Enter the first value :");
		int a = s1.nextInt();
		System.out.println("Enter the second value :");
		int b = s1.nextInt();
		boolean res = a >= b;
		System.out.println(res);
		s1.close();
		}


}
