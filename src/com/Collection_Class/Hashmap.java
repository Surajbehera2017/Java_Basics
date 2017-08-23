package com.Collection_Class;

import java.util.HashMap;

import org.openqa.selenium.WebElement;

public class Hashmap {

	public static void main(String[] args)
	{
	
		HashMap<Integer , String> H1 = new HashMap<>();
		H1.put(1, "Value1");
		H1.put(2, "Value2");
		H1.put(3, "Value3");	
		H1.put(4, "hello");
		
		System.out.println(H1.get(1));
		System.out.println(H1);
		HashMap<Integer, WebElement> H2 = new HashMap<>();
		//H2.put(1, value)

	}

}
