package com.cg.superkeyword;

//Super keyword is used to access parent class instance variable.
class Mobile
{
	protected String name = "Samsung";
}
class Samsung extends Mobile
{
	String name = "Galaxy M31s";
	void display()
	{
		System.out.println(super.name);
		System.out.println(name);
}
}
public class SuperVariable {

	public static void main(String[] args) {
		Samsung s = new Samsung();
		s.display();
	}
}