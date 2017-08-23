package com.popup;

public class Interface_Implementation implements Test,Test2
{

	
	public void F1() 
	{
		
	System.out.println("inside F1");	
	}

	
	public void F2() 
	{
		
	System.out.println("inside F2");	
	}

	public static void main(String[] args)
	{
	
		Test test = new Interface_Implementation();
		test.F1();
		test.F2();
		
	}
	
}
