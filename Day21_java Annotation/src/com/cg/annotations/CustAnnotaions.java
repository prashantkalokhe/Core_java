package com.cg.annotations;

import java.lang.annotation.*; 
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface OwnCustom
{
	int accept();
}
class C
{
	@OwnCustom(accept=39)
	public void display()
	{
		System.out.println("Hey I'm using Custom Annotation");
	}
}

public class CustAnnotaions {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		
		C c = new C();
		Method m = c.getClass().getMethod("display");
		OwnCustom obj = m.getAnnotation(OwnCustom.class);
		System.out.println(obj.accept());
	}
}