package com.basic;
import com.basic.data;

public class Access_Modifiers2 
{
	public static void main(String args[])
	{
	data d = new data();
	
	
	int a = d.protectedvar;					//inside package only public,protected variables and class can be accessed		
	int b = d.publicvar;
	System.out.println("inside Accessmodifiers2  "+a+":"+b);
	d.protectedmethod();
	//d.privatemethod();
	d.publicmethod();
	}
	
}
