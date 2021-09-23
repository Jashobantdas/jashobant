package com.practise;

import java.text.DateFormat;
import java.util.Date;

public class DateTime {

	public static void main(String[] args)
	{
		Date date=new Date();
		
		String s1= DateFormat.getDateInstance().format(date);
		System.out.println("today date is::"+s1);
		
		String s2=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(date);
         System.out.println("1 today date is::"+s2);
	}

}
