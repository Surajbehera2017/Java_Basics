package com.SuperKey;

import com.basic.main;

public class superkey extends parent{

	public void P1()
	{
		String S2 = "Child class variable";			
		System.out.println(super.S2);				//refers to the parent class variable
		System.out.println(S2);
	}
	
	public void P2()
	{
		super.P1();									//here the P1() is inherited from the parent as well as which is available in this class			
	}												//so to invoke the parent method we can use the super keyword 
	
	
	public static void main(String[] args)
	{
		
		superkey s1 = new superkey();
		s1.P2();												
	}
	
}
