package com.cg.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetExample {

	public static void main(String[] args) {
	SortedSet<String> s = new TreeSet<String> ();
	s.add("Beginner");
	s.add("Blown");
	s.add("Onkar");
	s.add("Dongar");
	System.out.println(s);
	}
}