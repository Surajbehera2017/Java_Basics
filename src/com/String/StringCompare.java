package com.String;

public class StringCompare {
	
	public static void main(String[] args)
	{
		dummy1().dummy2();
		
	}
	
	
	public void dummy2()
	{
		//When u are explicitly creating a string object using new String() method than it will make sure the a new object is created in the String pool and a reference of the object is returned.
		//but when you use the 2nd way using the literal, than there is a chance that an new object is not created and the reference of the old is returned. Due to this Strings are immutable in nature.
		
		
		String str1 = new String("Suraj1");	 	//String Object creation
		String str2 = new String("Suraj1");
		String str3 = "Suraj1";		//String literal 
		
		
		
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
	}
	
	public static StringCompare dummy1()
	{
		
		System.out.println("Inside dummy1");
		return new StringCompare() ;
	}

}
