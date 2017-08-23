package com.method_overriding;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class overriding extends overriding2
{
	void M1()
	{
		System.out.println("Inside Overriding ");
		
	}
	
	public static void main(String[] args)
	{
		overriding ob1 = new overriding();
		ob1.M1();
				
	}
	
}
