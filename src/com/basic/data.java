package com.basic;

public class data 
	{

	
	public int publicvar = 10;				//scope is within class data
	private int  privatevar = 20;
	protected int protectedvar = 30;
	int defaultvar = 40;
	
	//*********************
	public int publicmethod()
		{
		int a = publicvar;			//scope is within publicmethod
		int b = privatevar;
		System.out.println("inside public method of data class"+a+";"+b);
		return a;
		}
	
	private void privatemethod()
		{
		System.out.println("inside private method");
		}
	
	protected void protectedmethod()
		{
		System.out.println("inside protected method");
		}
	
	//***********************
	
	
	public class publicclass
		{
			int a =privatevar;					//inside own class the private variables are accessible.
		}
	
	private class privateclass
		{
		
		}
	
	protected class protectedclass
		{
		
		}
	
	//****************************
	public static void main(String[] args) 
	{
		
		

	}

}
