package com.cg.looping;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j,n=6;  
        for(i=1; i<n; i++) //outer loop for number of rows
            {           
            for(j=1; j<=i; j++) //  inner loop for columns
            {       
                System.out.print("$ ");
            }           
            System.out.println(); // ending line after each row
        } 
	}
}
