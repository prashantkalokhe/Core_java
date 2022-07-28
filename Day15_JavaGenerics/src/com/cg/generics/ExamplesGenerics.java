package com.cg.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ExamplesGenerics {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		Map<Integer,String>obj = new HashMap<Integer,String> ();
		obj.put(1, "Onkar");
		obj.put(2, "Sham");
		System.out.println(obj);
		
		Set<Map.Entry<Integer,String>>itr = obj.entrySet();
		
		Iterator<Map.Entry<Integer,String>>itr1 = itr.iterator();
		
		while(itr1.hasNext())
		{
			Map.Entry e = itr1.next();
			System.out.println(e.getKey() + " " +e.getValue());
		}
		
	}

}