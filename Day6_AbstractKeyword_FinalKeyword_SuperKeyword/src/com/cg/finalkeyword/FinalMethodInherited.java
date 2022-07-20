package com.cg.finalkeyword;

//Final method can be inherited but cannot be overridden
class X
{
	final void run()
	{
		System.out.println("Hello");
	}
}

public class FinalMethodInherited extends X {

	public static void main(String[] args) {
		FinalMethodInherited f = new FinalMethodInherited();
		f.run();
	}
}