package com.tns.strings;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
		String str = new String("Hello Everyone");
		System.out.println(str);
		Scanner s1 = new Scanner(System.in);
		String str1 = new String(s1.nextLine());
		System.out.println(str1);
		s1.close();
	}
}