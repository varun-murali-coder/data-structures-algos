package com.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
       String resetedValue=timeConversion("12:01:00AM");
	}
	
	public static String timeConversion(String s) throws ParseException {
	    // Write your code here
		SimpleDateFormat displayFormat=new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat sdFormat=new SimpleDateFormat("hh:mm:ssa");
		Date date=sdFormat.parse(s);
	       System.out.println(sdFormat.format(date) + " = " + displayFormat.format(date));
	       return displayFormat.format(date);
		

	    }

}
