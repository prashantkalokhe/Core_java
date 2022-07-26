package com.cg.Interfaces;

public interface InterfaceExample {
	
	//by default it's an abstract method.
	
	void display1();
}
class X implements InterfaceExample
{

	//provided the implementation for abstract method inside the demo class.
	
	
	@Override
	public void display1() {
		System.out.println("Interface Example ");
		
	}
	
}