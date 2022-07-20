package com.cg.abs;

abstract class A
{
	void print()
	{
		System.out.println("Non-abstract method");
	}
}
class B extends A
{
	//As B is inherited it will use the properties of A and print the statement
}

public class NonAbstractmethod
{
	public static void main(String[] args) 
	{
		
		A a=new B();
		a.print();
	}

}