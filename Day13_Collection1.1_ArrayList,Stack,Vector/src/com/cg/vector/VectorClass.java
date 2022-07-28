package com.cg.vector;

import java.util.Vector;

public class VectorClass {

	public static void main(String[] args) {
		Vector<Object>v = new Vector<Object> ();
		v.add("Onkar");
		v.add(11);
		v.add(13.4f);
		v.add("e");
		System.out.println(v);
	}
}