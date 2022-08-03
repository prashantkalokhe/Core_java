package com.cg.annotations;

//@Override is giving the extra information about the method.
class Car
{
	public void speed(int s)
	{
		System.out.println("Speed is : " +s+ " km/hr");
	}
}

class BMV extends Car
{
	@Override
	public void speed(int s)
	{
		System.out.println("Speed is : " +s+ " km/hr");
	}
}

public class OverrideAnnotations {

	public static void main(String[] args) {
		 BMV b = new BMV();
		 b.speed(60);
	}
}


