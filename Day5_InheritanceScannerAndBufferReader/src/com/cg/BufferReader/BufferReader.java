package com.cg.BufferReader;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s = b.readLine();
		System.out.println(s);
	}

}
