package com.cg.polymorphism;

class Triber
{
	int speed;
	String engine;
	Triber()
	{
		System.out.println("Renault-Triber");
	}
	Triber(int speed, String engine)
	{
		this.speed = speed;
		this.engine = engine;
		System.out.println("The speed is : "+speed+ " and the engine is on : "+engine);
	}
}

public class ConstructorOverloading {

	public static void main(String[] args) {
		Triber t = new Triber();
		Triber t1 = new Triber(45, "Petrol");

	}

}