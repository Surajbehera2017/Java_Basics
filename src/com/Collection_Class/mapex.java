package com.Collection_Class;

import java.util.*;

public class mapex 
{
	 int a; 
	
	mapex(int a)
	{
		this.a = a;
	}
	
	public static void main(String args[])
	{
		/*
		mapex mapa = new mapex(1);		
		System.out.println(mapa.a);
		*/
		HashMap<Integer, String> hmap = new HashMap<Integer,String>();
		hmap.put(1,"a");
		hmap.put(null,"78");
		hmap.put(3,"c");
		hmap.put(null,"98");
		System.out.println(hmap.get(null));
		
		Iterator it = hmap.entrySet().iterator();
		
		while(it.hasNext())
		{
			Map.Entry pair = (Map.Entry)it.next();
			System.out.println(pair.getKey());
			System.out.println(pair.getValue());
		}	
		System.out.println(hmap.get(3));
		
	}
	
	
}
