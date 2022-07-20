package com.cg.statickeyword;

public class StaticVariable {
	static int a=10;
	public static void main(String[] args) {
		//Changes the value of a//reinitialized
		a=17;
		System.out.println(a);
	}

}
