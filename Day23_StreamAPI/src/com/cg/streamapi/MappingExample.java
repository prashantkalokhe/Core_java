package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MappingExample {

	public static void main(String[] args) {
		List<String>obj = Arrays.asList(new String[] {"Apple","Orange","Mango","Pomogrenete"});
		System.out.println("Word length for object fruits");
		obj.stream().map(String::length).forEach(i->System.out.print(i+" "));
		System.out.println();
		List<Integer>obj1 = Arrays.asList(new Integer[] {32,78,43,12,67});
		List<Integer>obj2 = obj1.stream().map(i->i*i).collect(Collectors.toList());
		System.out.print(obj2+" ");
	}
}