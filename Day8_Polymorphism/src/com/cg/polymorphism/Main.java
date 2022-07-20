package com.cg.polymorphism;

//Method Overriding
class Parent
{
	void m1()
	{
		System.out.println("Parent - m1");
	}
}
public class Main extends Parent
{
	void m1()
	{
		System.out.println("Child - m1");
	}
	void m2()
	{
		System.out.println("Child m2");
	}
public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p = new Main();
		p.m1();
		Main m = new Main();
		m.m2();
	}
}