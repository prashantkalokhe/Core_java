package com.cg.thiskeyword;

//This keyword can be used as an argument in a method call.
class B
{
	void print(B b)
	{
		System.out.println("Function 1 is invoked");
	}
	void display()
	{
		print(this);
	}
}
public class MethodCall {

	public static void main(String[] args) {
		B b = new B();
		b.display();
	}
}