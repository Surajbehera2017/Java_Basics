package com.basic2;
import com.basic.*;

public class Access_Modifiers {

	public static void main(String[] args) 
	{
		data d = new data();		
		int a = d.publicvar;				//outside package only public variables can be accessed
		d.publicmethod();		
		
	}

}
