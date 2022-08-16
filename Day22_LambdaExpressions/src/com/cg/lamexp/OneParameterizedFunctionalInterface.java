package com.cg.lamexp;

interface C
{
	//One-parameter abstract method
	int print(int n);
	
}

/*class D implements C
{
	public int print(int n)
	{
		System.out.println("Program on to implement one parameterized interface using lambda expression");
		return n;
	}
	
}*/

public class OneParameterizedFunctionalInterface {

	public static void main(String[] args) {
		C obj1 = (int n)->
		{
			return n;
		};
		System.out.println(obj1.print(15));
	}

}