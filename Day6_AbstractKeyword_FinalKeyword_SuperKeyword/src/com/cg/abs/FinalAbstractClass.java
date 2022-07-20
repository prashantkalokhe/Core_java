package com.cg.abs;

//We cannot make any abstract class as Final in Java
//final abstract class Car
abstract class Car
{
	abstract void display();
}

class Maruti extends Car
{
	void display()
	{
		System.out.println("Maruti");
	}
}
public class FinalAbstractClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car c = new Maruti();
		c.display();
	}

}