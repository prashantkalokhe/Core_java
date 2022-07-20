package com.cg.superkeyword;


	//Super Method is used to access parent class method.
	class Animal
	{
		public int a=10, b=20;
		public void display()
		{
			System.out.println("The addition of two numbers : "+(a+b));
		}
	}
	class Tiger extends Animal
	{
		public void display()
		{
			System.out.println("Tiger");
		}
		void print()
		{
			display();
			super.display();
		}
	}
	public class SuperMethod 
	{
		public static void main(String[] args) {
			Tiger t =  new Tiger();
			t.print();
		}
	}

