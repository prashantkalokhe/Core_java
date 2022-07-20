package com.cg.inheritance;

class Bike1
{
	void speed(int speed)
	{
		System.out.println("The speed of the Bike is :" +speed+"km/hr");
	}
}

class Car1 extends Bike1
{
	//public int speed = 70;
	void average()
	{
		System.out.println("Good");
	}
}

class Bus extends Car1
{
	void average2(int s)
	{
		System.out.println(s + " is the speed of the bus");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b = new Bus();
		b.speed(50);
		b.average();
		b.average2(40);
	}
}