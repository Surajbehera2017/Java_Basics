package com.basic;

public class java_copy_constructor 
{
	int id ;
	static String N1;
	java_copy_constructor(int i,String name)
	{
		 id = i;
		 N1 = name;
		 return;
	}
	
	java_copy_constructor(java_copy_constructor s1)
	{
		 id = s1.id;
		 N1 = s1.N1;
		 return;
	}
	
	
	
	java_copy_constructor() 
	{
		
	}

	public static void main(String[] args)
	{
		
		java_copy_constructor S1 = new java_copy_constructor(1212,"Suraj");
		java_copy_constructor S2 = new java_copy_constructor(S1);
		
		//S2=S1;
		System.out.println(S1.id+S1.N1);
		System.out.println(S2.id+S2.N1);
		
	}
}
