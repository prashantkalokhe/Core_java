package com.cg.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;


public class BasicStream {

	public static void main(String[] args) {
		//Stream can be created with static data.
		Stream<String> obj = Stream.of("Sharmila","Akash","Prashant","Onkar");
		obj.forEach((i)->System.out.print(i+" "));
		System.out.println();
		//Stream can be acquired by array or collection.
		List<String>obj1 = Arrays.asList(new String[] {"Mumbai","Nashik","Pune","Nagpur"});
		//obj=obj1.stream();
		//obj.forEach((i)->System.out.print(i));
		obj1.forEach(System.out::println);
	}

}