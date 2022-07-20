package com.tns.operator;

import java.util.Scanner;

public class BitwiseOperator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s4 = new Scanner(System.in);
		System.out.println("Enter the first value : ");
		int a = s4.nextInt();
		System.out.println("Enter the second value : ");
		int b = s4.nextInt();
		int res = a & b;
		int res1 = a | b;
		int res2 = a^b;
		int res3 = a << b;
		System.out.println(res);
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		s4.close();
	}


}
