package com.cg.looping;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		for(int i=1;i<=n;i++)
		{
			System.out.println(i+ " ");
			s.close();
		}

	}

}
