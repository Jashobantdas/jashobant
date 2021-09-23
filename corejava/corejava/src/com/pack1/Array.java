package com.pack1;

import java.util.Scanner;

public class Array {

	public static void main(String[] args)
	{
		
          String []arr1=new String[8];
          Scanner sc=new Scanner(System.in);
          for(int i=0;i<arr1.length;i++)
          {
        	  
        	  System.out.println("enter the name::");
        	  String s=sc.nextLine();
        	  
        	  arr1[i]=s;
        
          }
          sc.close();
          for(String s:arr1)
          {
        	  System.out.println(s);
          }
	}

}
