package com.cg.lamexp;

interface F
{
	int add(int a, int b);
}

public class LambdaExpression {

	public static void main(String[] args) {
		//Lambda Expression without returning a value
		F obj = (int a, int b) -> (a*b);
		System.out.println("Multiplication of A and B is : "+obj.add(15, 5));
	}
}