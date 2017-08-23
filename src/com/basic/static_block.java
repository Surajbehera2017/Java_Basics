package com.basic;

public class static_block 
{
	static int a;
	static						//used to initialize the static data members before the main method execution
	{
		a=10;
		System.out.println("Inside static block\n"+a);			
	}
	
	public static void main(String[] args)
	{
		System.out.println(a);
	}
}
