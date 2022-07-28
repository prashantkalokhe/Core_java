package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetClass {

	public static void main(String[] args) {
	Set<Object>obj = new LinkedHashSet<Object> ();
	obj.add("Onkar");
	obj.add(1);
	obj.add(3.75f);
	System.out.println(obj);
	//To extract the elements of a set separately.
	Object[] arr = obj.toArray();
	for(int i=0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
	}
}