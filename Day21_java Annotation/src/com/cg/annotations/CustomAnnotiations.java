package com.cg.annotations;

import java.lang.annotation.*; 
import java.lang.reflect.Method;

@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
//Custom Annotation
@interface Custom
{
	//abstract method.
	//Single value Annotations
	//Multiple-Value Annotations
     String print() default "Prash";
     int speed() default 76;
     float percentage() default 64.71f;
}

class B
{
	@Custom (print = "Hello Students",speed = 76, percentage = 64.71f)
	public void display()
	{
		System.out.println("Hurrah ! Its holiday");
	}
}
	
public class CustomAnnotiations {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
	
		B b = new B();
		b.display();
		Method m = b.getClass().getMethod("display");
		Custom obj = m.getAnnotation(Custom.class);
		
		System.out.println(obj.print());
		System.out.println(obj.speed());
		System.out.println(obj.percentage());
	}
}