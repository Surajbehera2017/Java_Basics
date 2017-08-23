package Throws;

public class ExceptionExample {

	public static void main(String[] args) throws Exception {
		System.out.println(" in main method");
		new ExceptionExample().m1();
		S1.M3();
//m1();
	}

	private static void m1() throws Exception {
		System.out.println(" in method m1 ");
		
		
//m2();		
	}

	private static void m2() throws Exception {
		System.out.println(" in method m2");
		try
		{
		System.out.println(10/0);
		}
		catch(ArithmeticException e)
		{ 
			System.out.println("Your number format is wrong. Please enter the correct Number");
			throw new Exception("Your number format is wrong. Please enter the correct Number");
			
		}
		
		
		
	}
	
	public static class S1
	{
		public static void M3()
		{}
		
		
	}

}
