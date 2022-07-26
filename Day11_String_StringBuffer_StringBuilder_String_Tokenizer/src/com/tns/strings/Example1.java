package com.tns.strings;

import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		String str = "Virat Kohli";
		System.out.println(str);
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		System.out.println(str1);
		s.close();
	}
}