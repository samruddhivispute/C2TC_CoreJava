package com.tns.program;

class Day1 {
	void java()
	{
		System.out.println("java is diff");
	}

}
class Day2 extends Day1
{
	void java()
	{
		System.out.println("java is easy after practicing");
	}
}

public class Program3 
{
public static void main(String[] args) 
{
	Day1 d1=new Day1();
	d1.java();
}
}
