package com.practise;

import java.util.Scanner;

public class Table {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("Entyer the input no.");
         int a=sc.nextInt();
         for(int i=1;i<=10;i++)
         {
        	 int d=a*i;
        	 System.out.println(a+"*"+i+"="+d);
         }
         sc.close();
	}

}
