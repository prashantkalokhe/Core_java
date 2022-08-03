package com.cg.annotations;

import java.lang.annotation.*;
import java.lang.reflect.Method;
//If we need to inherit an annotation from superclass then go with the inherited annotation
@Inherited
@Documented
@Retention(RetentionPolicy.RUNTIME)

//Custom annotation
@interface Custom1
{
	//abstract class
	//Single-Value annotation
	String print();
}
class D
{
	@Custom1(print="Prash")
	public void display()
	{
		System.out.println("Displaying Inherited");
	}
}

class E extends D
{
	public void display1()
	{
		System.out.println("Displaying Inherited : 1");
	}
}
public class InheritedAnnotation {


	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		E obj = new E();
		obj.display();
		obj.display1();
		Method m=obj.getClass().getMethod("display");
		Custom1 obj1=m.getAnnotation(Custom1.class);
		System.out.println(obj1.print());
	}
}