package com.cg.generics;

public class GenericMethod {
	
	public static void main(String[] args) {

	Integer arr[] = {11,22,33};
	Character ch[] = {'P','S','Z'};
	
	System.out.println("Integer array : ");
	print(arr);
	
	System.out.println("Character array : ");
	print(ch);
	
	}
	
		//In Generic Method, We can pass any type of arguments.
		//E is Element
		public static <E>void print(E[] elements)
		{
			for(E elem:elements)
			{
				System.out.println(elem);
		}
			System.out.println();
		}
}