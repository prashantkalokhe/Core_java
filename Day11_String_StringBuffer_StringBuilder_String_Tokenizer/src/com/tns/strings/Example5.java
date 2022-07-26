package com.tns.strings;

import java.util.Scanner;

public class Example5 {

	public static void main(String[] args) {
		Scanner s3 = new Scanner(System.in);
		String str = s3.nextLine();
		String str1 = s3.nextLine();
		System.out.println(str.length());
		System.out.println(str.charAt(2));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.concat(str1));
		s3.close();
	}
}