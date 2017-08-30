package com.k2js.samplemavenprojct.testscript;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CurrentSystemDate {
	public static void main(String[] args) {
//		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
//		Date date = new Date();
//		System.out.println(dateFormat.format(date));
		System.out.println(getSystemDate());
	}
	
	public static String getSystemDate()
	{
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH_mm_ss");
		Date date = new Date();
		return dateFormat.format(date);
	}
}
