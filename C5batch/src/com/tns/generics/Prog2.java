package com.tns.generics;

import java.util.ArrayList;
import java.util.List;

class Data
{
	public <E> void printListData(List<E>obj1)
	{ 
		for(E i:obj1)
		{
			System.out.println(i);
		}
		
	}
	public <E> void printArrayData()
	{
		
	}
}


public class Prog2 {

	public static void main(String[] args)
	{
		
		List<Integer>obj1=new ArrayList<>();
		obj1.add(1);
		obj1.add(2);
		obj1.add(3);
		obj1.add(4);
		obj1.add(5);
		Data D=new Data();
		D.printListData(obj1);
		
		List<String>obj2=new ArrayList<>();
		obj2.add("hello");
	obj2.add("Batch");
		obj2.add("B37");
		obj2.add("Program");
		D.printListData(obj2);
		
		
		
		
		
		
		
    }

	}

	


