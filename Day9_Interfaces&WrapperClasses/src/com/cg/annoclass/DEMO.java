package com.cg.annoclass;
abstract class Annonymus
{
	public abstract void method();
}

public class DEMO {

	public static void main(String[] args)
	{
		Annonymus a = new Annonymus()
		{
			public void method()
			{
			System.out.println("This is an a example of Annonymus Class");
			}
		};
	a.method();
	}

}