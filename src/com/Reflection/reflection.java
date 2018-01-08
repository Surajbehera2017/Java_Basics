package com.Reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class reflection {
	
	public void func1()
	{
		System.out.println("inside function 1");
		this.func2();
	}

	public void func2()
	{
		System.out.println("inside function 2");
		
	}
	
	public void reflectionConcept(String methodName) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		Method Execute = getClass().getMethod(methodName );
		Execute.invoke(this);
	}
	
	public static void main(String args[]) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
		reflection ref = new reflection();
		ref.reflectionConcept("func1");
		
	}
	
}
