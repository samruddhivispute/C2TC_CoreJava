package com.tns.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Prog2
{
	
	void Display(List<String>list)
	{
		ListIterator<String>obj=list.listIterator();
		while(obj.hasNext())
		{
			System.out.println("elements is "+obj.next());
		}
			
		
	}
	public static void main(String[] args)
	
	{
        LinkedList<String> obj1=new LinkedList<>();
        obj1.add("India");
        obj1.add("USA");
        obj1.add("China");
        obj1.add("JApan");
        obj1.add("Egypt");
        System.out.println(obj1);
        
        
        
        
        Prog2 p2=new Prog2();
        Collections.reverse(obj1);
        p2.Display(obj1);
        System.out.println("//////////////////////////////");
        
        obj1.sort(null);
        p2.Display(obj1);
        
      
       
        
	}
}
