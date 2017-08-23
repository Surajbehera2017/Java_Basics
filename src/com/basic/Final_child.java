package com.basic;

//public final class Final_child 			//If we use final keyword for the class than the class can't be inherited or extended.
public class Final_child
{
	final int a = 10;
	
	final public void child()
	{
		System.out.println("inside inheritance child method");
		//a=20; ------------a can't be assigned again due to Final modifier
	}
	
}
