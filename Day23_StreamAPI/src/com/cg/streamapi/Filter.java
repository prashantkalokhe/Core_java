package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class Filter {

	public static void main(String[] args) {
		List<Float>obj=Arrays.asList(12.5f,56.8f,61.5f);
		System.out.println(obj);
		//Filtering with conditions : filter(predicate)
		obj.stream().filter(i->i>15.9f).forEach(System.out::println);;

	}

}