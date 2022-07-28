package com.cg.list;

import java.util.ArrayList;
import java.util.Scanner;

public class UserDefinedArrayList {

	public static void main(String[] args) {
		Scanner s =  new Scanner(System.in);
		String str = s.nextLine();
		System.out.println(str);
		Scanner token = new Scanner(str);
		token.useDelimiter(" ");
		ArrayList<Object>arr = new ArrayList<Object>();
		while(token.hasNext())
		{
			arr.add(token.next());
			System.out.println(arr.get(arr.size()-1));
		}
		System.out.println(arr);
		s.close();
		token.close();
	}

}
