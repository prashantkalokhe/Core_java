package com.cg.lamexp;

interface E
{
	String show(String s,String t);
}

public class TwoParameterizedFunctionalInterface {

	public static void main(String[] args) {
		
		//Lambda Expression
		E obj= (String s,String t)->
		{
			return s+t;
		};
		System.out.println(obj.show("Prashant"," " + "Ram"));

	}
}