package com.cg.Interfaces;

interface Inf {
	
	int x=10;
	//by default it's an abstract method.
	void display();
}
class Demo implements Inf
{

	//provided the implementation for abstract method inside the demo class.
	
	@Override
	public void display() {
		System.out.println("Interface" + " The value of x is : " +x);
		
	}
}
public class Main
{
	public static void main(String args[]) {
		Demo d = new Demo();
		d.display();
	}
}