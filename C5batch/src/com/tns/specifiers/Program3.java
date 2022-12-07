package com.tns.specifiers;

import com.tns.encapsulation.Program1;
import com.tns.encapsulation.Program4;

public class Program3 extends Program1
{
	public static void main(String[] args)
	{
		Program1 p1=new Program1 ();
		System.out.println(p1.a);
		p1.test();
		Program3 p3=new Program3();
		System.out.println(p3.b);
		p3.run();
		Program4 ref=new Program4();
				
		
		
		
		
	}

}
