package com.cg.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {

	public static void main(String[] args) {
		//HashSet is an unordered Set.
		Set<Object>obj = new HashSet<Object> ();
		obj.add("Onkar");
		obj.add("M");
		obj.add(4.6);
		obj.add(45);
		obj.add(5);
		obj.add(65);
		obj.add(15);
		System.out.println(obj);
	}
}