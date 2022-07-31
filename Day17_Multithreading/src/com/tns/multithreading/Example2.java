package com.tns.multithreading;

class Test
{
	public static synchronized void display()
	{
		System.out.println("Current thread " + Thread .currentThread().getName());
		for(int i = 0; i < 7 ; i++)
		{
			System.out.println(Thread.currentThread().getName() + "i - " +i);
			try
			{
				Thread.sleep(50);
			}
			catch (InterruptedException e)
			{
				e.printStackTrace();
			}
		}
	}
}
class Valueof implements Runnable{
	Thread t;
	Test val;
	Valueof(Test val)
	{
		this.val = val;
		t = new Thread(this);
		t.start();
	}
	@SuppressWarnings("static-access")
	public void run()
	{
		val.display();
	}
}
public class Example2 {
	public static void main(String[] args) {
		Test obj1 = new Test();
		Test obj2 = new Test();
		@SuppressWarnings("unused")
		Valueof t1 = new Valueof(obj1);
		@SuppressWarnings("unused")
		Valueof t2 = new Valueof(obj2);
		}
	}