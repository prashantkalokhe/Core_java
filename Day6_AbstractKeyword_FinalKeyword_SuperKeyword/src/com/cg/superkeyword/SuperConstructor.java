package com.cg.superkeyword;

//Super Constructor is used to access parent class constructor.

class Flower
{
	Flower()
	{
		System.out.println("Flower");
	}
}
class Rose extends Flower
{
	Rose()
	{
		//We're invoking parent class constructor.
		//First give the preference to constructor call and print the statement.
		super();
		System.out.println("Rose are red");
	}
}
class Violet extends Flower
{
	Violet()
	{
		super();
		System.out.println("Violets are blue");
	}
}
public class SuperConstructor {

	public static void main(String[] args) {
		Rose r = new Rose();
		Violet v = new Violet();
	}

}