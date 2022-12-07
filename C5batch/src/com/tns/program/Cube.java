package com.tns.program;

 class Main
{
	 void disp()
	{
		System.out.println("hello my name is Samruddhi");
	}

void disp1()
{
	System.out.println("Samruddhi traines this batch");
}
}


public class Cube extends Main
{
	void disp()
	{
		System.out.println("hello my name is Samruddhi");
	}


public static void main(String[] args) 
{
	Cube c=new Cube();
	c.disp();
	c.disp1();
	
}
}
