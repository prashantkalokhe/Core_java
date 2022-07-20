package com.cg.thiskeyword;

//this keyword can be used to return the current class instance.
class Addition
{
	int a;
	int b;
	
	Addition() //Default Constructor
	{
		a=13;
		b=22;
	}
	Addition get() //Method to return class instance
	{
		return this;
	}
	void display()
	{
	System.out.println("The addition of a and b is : " +(a+b));
	}
}
public class CurrentClassInstance {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.get().display();
	}

}