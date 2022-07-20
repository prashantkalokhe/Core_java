package com.cg.Decisionmaking;

import java.util.Scanner;

public class Switch_Case {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int a=s.nextInt();
		switch(a) 
		{
		case 1:
			System.out.println("Srivalli");
			break;
		case 2:
			System.out.println("Hello");
			break;
		case 3:
			System.out.println("Rita");
			break;
		default:
			System.out.println("Invalid input");
			s.close();
		}
	}

}
