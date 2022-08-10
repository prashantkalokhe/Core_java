package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamOperation {

	public static void main(String[] args) {
		List<Integer>obj = Arrays.asList(10,20,30,40,50,10,30,56,45);
		//It displays the unique values and not duplicates in the list.
		obj.stream().distinct().forEach(i->System.out.print(i+" "));
		System.out.println();
		//It sets the first n elements in the lists
		obj.stream().limit(5).forEach(i->System.out.print(i+" "));
		System.out.println();
		//It sorts the elements.
		obj.stream().sorted().forEach(i->System.out.print(i+" "));

	}

}
