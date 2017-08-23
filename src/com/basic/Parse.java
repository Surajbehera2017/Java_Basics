package com.basic;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class Parse {

	public static void main(String[] args) throws ParseException
	{
		int a;
		String s;
		
		a=10;
		s=Integer.toString(a);				//parsing from integer to string
		
		System.out.println(a+10);			//20
		System.out.println(s+10);			//1010
		
		/***************************/
	
		
		s="76";
		a=Integer.parseInt(s);				//parsing from string to integer
		
		System.out.println(a+10);			//86
		System.out.println(s+10);			//7610
		
		
		/***************************/
		
		
		SimpleDateFormat date1 = new SimpleDateFormat("dd/mm/yyyy");
		String D1="16/07/1992";				
		
		Date Dummydate= date1.parse(D1);
		
		System.out.println(Dummydate);
		
	}

}
