package com.cg.lamexp;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ComparableLambda {

	public static void main(String[] args) {
		//lambda expression
		Comparator<String> obj = (s1,s2)-> Integer.compare(s1.length(),s2.length());
		String arr[] = {"PQR","Prashant","Tina"};
		Collections.sort(Arrays.asList(arr),obj);
		for(String i : arr)
		{
			System.out.println(i);
		}
	}
}