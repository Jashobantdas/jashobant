package com.pack2;
import java.text.DateFormat;
import java.util.Date;
public class DateTime 
{
   public void method1()
	{
		Date currentDate=new Date();
		System.out.println("today date is: "+currentDate);
		
		String dateToStr = DateFormat.getInstance().format(currentDate);  
        System.out.println("1 Date Format using getInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateInstance().format(currentDate);  
        System.out.println("2 Date Format using getDateInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance().format(currentDate);  
        System.out.println("3 Date Format using getTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getDateTimeInstance().format(currentDate);  
        System.out.println("4 Date Format using getDateTimeInstance(): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.SHORT).format(currentDate);  
        System.out.println("5 Date Format using getTimeInstance(DateFormat.SHORT): "+dateToStr);  
  
        dateToStr = DateFormat.getTimeInstance(DateFormat.MEDIUM).format(currentDate);  
        System.out.println("6 Date Format using getTimeInstance(DateFormat.MEDIUM): "+dateToStr);  
          
        dateToStr = DateFormat.getTimeInstance(DateFormat.LONG).format(currentDate);  
        System.out.println("7 Date Format using getTimeInstance(DateFormat.LONG): "+dateToStr);  
          
        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(currentDate);  
        System.out.println("8 Date Format using getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT): "+dateToStr);  
    }
    
   public static void main(String[] args) 
	{
		DateTime obj1=new DateTime();
		obj1.method1();
	}

}
