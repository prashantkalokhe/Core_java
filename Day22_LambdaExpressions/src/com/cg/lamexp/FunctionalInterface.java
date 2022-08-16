package com.cg.lamexp;

//functional interface
interface A
{
	//Zero-Parameter abstract method.
	void show();
}
class B implements A
{
	@Override
	public void show()
	{
		System.out.println("Program on to implement functional interface using lambda expression");
	}
	
}

public class FunctionalInterface {

	public static void main(String[] args) {
		
		//Lambda Expression
		A obj = ()->
		{
			System.out.println("Program on to implement functional interface using lambda expression");
		};
		obj.show();
	}
}