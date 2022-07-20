package com.cg.Decisionmaking;

public class Cascaded_if_else {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=11,b=7,c=23;
		if(a>b && a>c)
		{
			System.out.println(a);
		}
		else if (b>a && b<c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}

	}

}
