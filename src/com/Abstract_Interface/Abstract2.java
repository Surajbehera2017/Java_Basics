package com.Abstract_Interface;

public class Abstract2 extends Abstract1 {

	
	public void func2() {
		System.out.println("Func2 implementation in the abstract2");
		
	}
	public static void main(String[] args)
	{
		Abstract2 a = new Abstract2();
		a.func1();
		a.func2();
		
	}
}
