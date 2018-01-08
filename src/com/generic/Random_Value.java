package com.generic;

import java.util.Random;

public class Random_Value {

	public static void main(String[] args) 
	{
		Random rand = new Random(); 
		int value = rand.nextInt(50); 
		System.out.println(value);
	}

/*	public String random(String a[])
	{
		String x;
		Random rand = new Random();
		
		
		return x;
	}*/
}
