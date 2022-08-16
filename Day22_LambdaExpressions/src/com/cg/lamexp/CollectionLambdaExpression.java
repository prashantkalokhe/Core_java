package com.cg.lamexp;

//program on lambda expression in terms of Generic and Collection
import java.util.LinkedList;

public class CollectionLambdaExpression {

	public static void main(String[] args) {
		LinkedList<Integer>obj=new LinkedList<>();
		obj.add(11);
		obj.add(12);
		obj.add(13);
		obj.add(14);
		System.out.println(obj);
		//Lambda Expression
		obj.forEach((i)->
		{
			System.out.println(i);
		});


	}

}