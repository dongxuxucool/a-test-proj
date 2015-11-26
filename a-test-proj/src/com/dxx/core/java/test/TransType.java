package com.dxx.core.java.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransType {

	public static void main(String[] args) throws ParseException {
		String str = "15630.0";
//		Math.round(str);
//		System.out.println(Long.parseLong(str));

		Object strDate = "2011-11-11";
	    SimpleDateFormat format_long = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

	    String result = format_long.format((Date)strDate).replaceAll(" 00:00:00", "");
	    System.out.println("result = " + result);
////		Date date = new Date();
//		Object dateObj = (Object)date;
//		SimpleDateFormat sdf =   new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//	    Date date = sdf.parse(strDate);
//
//		System.out.println("date = " + date);
	}

}
