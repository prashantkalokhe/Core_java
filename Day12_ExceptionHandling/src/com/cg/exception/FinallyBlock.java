package com.cg.exception;

import java.util.Scanner;

public class FinallyBlock {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		// if any exception will be there in the try block.
		// that exception will handle by catch block.
		try
		{
		int res = 15/ x;
		System.out.println(res);
		// Finally block will not execute if you call below statement.
		System.exit(0);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Whether any exception is occured or nor, Finally Block is executed");
		}
		s.close();
	}

}