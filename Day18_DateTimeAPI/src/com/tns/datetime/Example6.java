package com.tns.datetime;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

public class Example6 {

	public static void main(String[] args) {
		LocalTime t = LocalTime.now(ZoneId.of("Iran"));
		LocalDateTime dt = LocalDateTime.now(ZoneId.of("Iran"));
		System.out.println(t);
		System.out.println(dt);
		for(String s:ZoneId.getAvailableZoneIds())
		{
			System.out.println(s);
		}
	}
}