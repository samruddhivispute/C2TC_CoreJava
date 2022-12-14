package com.tns.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Prog3 {

	public static void main(String[] args) 
	{
		Set<String>obj=new TreeSet<>();
		for (int i=30;i>0;i--)
		{
			obj.add("A"+i);
		}
		for(String i:obj)
		{
		System.out.println(i);
		}
		
    
	}

}
