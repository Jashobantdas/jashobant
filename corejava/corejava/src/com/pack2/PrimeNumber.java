package com.pack2;
import java.text.DateFormat;
import java.util.Date;
import java.util.Scanner;
public class PrimeNumber 
{
	
    protected PrimeNumber()
	{
		Date date=new Date();
		String s=DateFormat.getDateTimeInstance(DateFormat.LONG,DateFormat.SHORT).format(date);
		System.out.println("Today date is::"+s);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st number::");
		int i=sc.nextInt();
		System.out.println("Enter the 2nd number::");
		int j=sc.nextInt();
		sc.close();
		PrimeNumber pn=new PrimeNumber();
	}

}
