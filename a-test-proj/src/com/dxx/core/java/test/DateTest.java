package com.dxx.core.java.test;

import java.util.Date;

public class DateTest {

	public static void main(String[] args) {
		long timeOffset = 7*24*3600*1000;
		Date date = new Date();
		System.out.println("date=" + date.getTime()+"now = "+System.currentTimeMillis());
		System.out.println("gmt = " + date.toGMTString());
		Date newDate = new Date(date.getTime()+timeOffset);
		System.out.println("newDate = " + newDate);
		System.out.println(timeOffset+"");
		System.out.println(new Date());
		
		String month = "03";
		System.out.println("month = " + Integer.parseInt(month));
		float a = 9.11f;
		float b =10.12f;
		System.out.println("a-b = " + (a-b)/11);
	}

}
