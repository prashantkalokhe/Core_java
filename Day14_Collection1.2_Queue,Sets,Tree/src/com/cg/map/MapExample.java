package com.cg.map;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		Map<String,Integer> obj = new HashMap<String,Integer> ();
		obj.put("Ram", 3);
		obj.put("Sham", 6);
		System.out.println(obj);
	}
}