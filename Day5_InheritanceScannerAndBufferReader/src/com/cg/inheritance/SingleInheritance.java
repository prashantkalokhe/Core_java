package com.cg.inheritance;

class Bike
{
	public int speed = 50;
	void speed()
	{
		System.out.println("The speed of the Bike is :" +speed+"km/hr");
	}
}

class Car extends Bike
{
	public int speed = 70;
	void average()
	{
		System.out.println("Good");
	}
}
public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.speed();
		c.average();
	}

}