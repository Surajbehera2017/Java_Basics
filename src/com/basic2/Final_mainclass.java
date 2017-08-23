package com.basic2;

import com.basic.Final_child;

public class Final_mainclass extends Final_child 
{
	
	/*
	public void child()
	{													//can't override the method from Final_child as it is having final keyword 
		System.out.println("Inside final mainclass");
	}*/
	
	public static void main(String[] args)
	{
		Final_mainclass ob1 = new Final_mainclass();
		ob1.child();
		Dummy d = new Dummy("S1");
		
			
	}
}
