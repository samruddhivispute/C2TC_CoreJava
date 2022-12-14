package com.tns.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.Stack;

public class Prog1 
{
	void Display(List<String> list)
	{
		Iterator<String> obj=list.iterator();
		while(obj.hasNext())
		{
			System.out.println("Elements is: "+obj.next());
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
         
         Prog1 p1=new Prog1();
         p1.Display(obj1);
         
         
         
         
        
         
         
         
         
         
         
         
         
         
         
         
         
         
       


	}

}
