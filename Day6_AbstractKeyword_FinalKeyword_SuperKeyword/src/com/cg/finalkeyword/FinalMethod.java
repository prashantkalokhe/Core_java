package com.cg.finalkeyword;

class C
{
	void Accept()
	{
		//We cannot override final method
		//final void accept()
		System.out.println("Hey there, I wanna provide restrictions");
	}
}

class D extends C
{
	void Accept()
	{
		System.out.println("Restriction provided");
	}
}
public class FinalMethod {

	public static void main(String[] args) {
		D d = new D();
		d.Accept();
	}

}