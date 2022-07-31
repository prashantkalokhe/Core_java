package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Example2 {

	public static void main(String[] args) {
		String datetime="2022-07-31 21:17";
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
		LocalDateTime l = LocalDateTime.parse(datetime, dtf);
		System.out.println(l);
	}
}