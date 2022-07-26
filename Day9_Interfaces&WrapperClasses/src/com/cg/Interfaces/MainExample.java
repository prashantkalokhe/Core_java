package com.cg.Interfaces;

//abstract method
interface Vehicle
{
	void speed();
}

//When we use two interfaces and we are going to use one interface from another interface
//then use extends keyword
interface Car extends Vehicle
{
	void engine();
}
class Bus implements Car
{
	public void engine()
	{
		System.out.println("Petrol");
	}

	@Override
	public void speed() 
	{
		System.out.println("Speed is 40 km/hr");
		
	}
}
public class MainExample 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Bus b = new Bus();
		b.engine();
	}
}