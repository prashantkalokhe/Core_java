package com.cg.lamexp;

import java.io.File;
import java.io.FileFilter;

public class FileFilterLambdaExpression {
	
	public static void main(String args[]) {
		//lambda expression
		FileFilter obj = (File pathname)->pathname.getName().endsWith(".txt");
		File dir = new File ("C:\\Users\\hp\\OneDrive\\Desktop");
		File[] contents = dir.listFiles(obj);
		for(File i : contents)
		{
			System.out.println(i);
		}	
	}
}


}