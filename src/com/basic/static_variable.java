package com.basic;

public class static_variable 
{
	String S3;
	static String S1;
	static String S2;
    public static void Func1()
    {
     S1 = "Hello";
     S2 = "Moto";    	 
     int i=1;
     int j=2;
     int sum = i+j;  		//not possible to declare a variable as static inside a method;//instance variable can only be accessed inside the method
     
    }
	public static void main(String[] args) 
	{
		
		static_variable S1 = new static_variable();
		static_variable S2 = new static_variable();
		static_variable.Func1();
		System.out.println(S1.S1+S1.S2);		//S1.sum is not possible since it is a instance(local) variable.
		System.out.println(S2.S1+S2.S2);
		
		
		demo d1 = new demo();
		System.out.println(d1.innerdemo());
				
	}

	public static class demo				//Inner class need to be declared as static(class inside class)
	{
		//String s2=S3;						demo is static class and can access static methods and variables; ie; S1,S2 and not S3	
		String S1;
		int i1;
		Boolean b = true;		
		public String innerdemo()			//Non static methods can be called using object:here d1 is the object.
		{
			return S1="Helloinnerdemo";
		}
	}
}
