package com.String;

import javax.print.DocFlavor.CHAR_ARRAY;

public class string_basic_1 
{
	
	public static void main(String[] args)
	
	{
	String a;
	
	a ="Suraj";
	
	char b[] = a.toCharArray();
	int i= 1;
	System.out.println(b);
	
	for(char c:b)
	{		
		System.out.println(c+","+i);
		i =i+1;
	}
		
	}
	
	
}
