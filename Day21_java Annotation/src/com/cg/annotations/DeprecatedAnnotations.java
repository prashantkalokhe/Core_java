package com.cg.annotations;

class A
{
	//It will allows any element no longer to be used.
	@Deprecated
	public void print()
	{
		System.out.println("Welcome to the C2TC Program");
	}
}

public class DeprecatedAnnotations {

	public static void main(String[] args) {
		A a = new A();
		a.print();
	}
}