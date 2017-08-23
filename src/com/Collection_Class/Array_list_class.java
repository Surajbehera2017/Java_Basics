package com.Collection_Class;

import java.util.ArrayList;

public class Array_list_class
{
public static void main(String args[])
	{
	ArrayList<String> A1 = new ArrayList<String>();
		
		A1.add("A1");
		A1.add("A2");
		A1.add("A3");
		A1.add("A4");
		
		System.out.println(A1.size());
		System.out.println(A1.indexOf("A1"));
		System.out.println(A1.get(1));
		
		
		for(String ele:A1)
		{
			System.out.println(ele);
		}
	}
	
}
