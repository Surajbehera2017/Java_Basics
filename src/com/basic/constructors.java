package com.basic;

public class constructors 
{
	static String demo;
	constructors(String a)
	{
		 demo = a;
		 System.out.println(a);
	}
	
	public constructors func1()
	{
		return new constructors("Hello MOTO");
	}
}

