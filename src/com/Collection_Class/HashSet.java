package com.Collection_Class;
import java.util.*;  

public class HashSet 
{

	public static void main(String[] args)
	{
		ArrayList<String> li = new ArrayList<String>();
		li.add("Suraj1");
		li.add("Suraj2");
		li.add("Suraj3");
		li.add("Suraj4");
		
		for(String str:li)
		{
		System.out.println(str);
		}
		
		HashMap<Integer, String> map = new HashMap<Integer,String>();
		map.put(1, "Suraj1");
		map.put(2, "Suraj2");
		map.put(3, "Suraj3");
		map.put(4, "Suraj4");
		
		for(HashMap.Entry m1:map.entrySet())
		{
			System.out.println(m1.getKey()+"\t"+m1.getValue());
			
		}
	}
}
