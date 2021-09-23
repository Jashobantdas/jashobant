package com.pack1;

import java.util.Scanner;

public class StringMethod {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first name::");
        String s1=sc.nextLine().toUpperCase();
        System.out.println("Enter the middle name::");
        String s2=sc.nextLine().toUpperCase();
        System.out.println("Enter the last name::");
        String s3=sc.nextLine().toUpperCase();
        sc.close();
        StringMethod obj1=new StringMethod();
        obj1.meth1(s1,s2,s3);
        obj1.meth2();
	}
    
	private void meth2() 
	{
		// TODO Auto-generated method stub
		char []arr = {'p','r','o','g','r','a','m'};
		String s=new String(arr);//program
		System.out.println("s value is::"+s);//program
		char []arr1 = {'i','s',' ','a','w','e','s','o','m','e'};
		String s1=new String(arr1);
		System.out.println("s1 value is::"+s1);//is awesome
		String s3=s+" ".concat(s1);
		System.out.println("s3 value is::"+s3);//s3 value is::program is awesome
		System.out.println("s3 length is::"+s3.length());//18
		boolean b=s1.equals(s3);
		System.out.println("content comparision in between s1 and s3 is::"+b);//false
		boolean b1=s.startsWith("p");
		System.out.println("check wheather string s is starts with p or not::"+b1);//true
		String str=new String(" java is awesome ");
		String i=str.intern();
		System.out.println(i);
		String str1=str.trim();
		System.out.println("length of str::"+str.length());
		System.out.println("length after trimmimg of str::"+str1.length());
		System.out.println(str1);
		String str2=str1.substring(5);
		System.out.println("str1 value after substring method::"+str2);
		String str3=str1.substring(5,14);
		System.out.println("str3 after substring method::"+str3);
	}

	private void meth1(String fname, String mname, String lname) 
	{
		// TODO Auto-generated method stub
		String s1=fname.concat(mname);
		String s2=s1.concat(lname);
		System.out.println("The name is "+s2);
	}
	

}
