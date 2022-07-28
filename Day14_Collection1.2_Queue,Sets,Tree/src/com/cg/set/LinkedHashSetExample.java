package com.cg.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
	
	public static void main(String args []) {
		//LinkedHashSet is an ordered Set.
		Set<Object>obj = new LinkedHashSet<Object> ();
		obj.add("Onkar");
		obj.add("r");
		obj.add(4.6);
		obj.add(45);
		obj.add(5);
		obj.add(65);
		obj.add(15);
		System.out.println(obj);
	}

}