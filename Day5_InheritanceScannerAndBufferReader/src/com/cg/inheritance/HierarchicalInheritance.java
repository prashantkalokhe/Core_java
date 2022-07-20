package com.cg.inheritance;

class LaptopBrand
{
	void displayname(String l)
	{
		System.out.println(l + " is the brand");
	}
}

class HPVictus extends LaptopBrand
{
	void display2()
	{
		System.out.println("HP Victus Laptop");
	}
}

class HPOmen extends LaptopBrand
{
	void display1()
	{
		System.out.println("HP Omen Laptop");
	}
}

class HPPavallion extends LaptopBrand
{
	void display()
	{
		System.out.println("HP Pavallion Laptop");
	}
}
public class HierarchicalInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HPPavallion h = new HPPavallion();
		HPOmen ho = new HPOmen();
		HPVictus hv = new HPVictus();
		h.displayname("HP");
		h.display();
		ho.display1();
		hv.display2();
	}

}