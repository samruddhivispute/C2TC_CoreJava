package com.tns.encapsulation;

class Sample1
{
	void test()
	{
		System.out.println("test method");
	}
}
class Sample2 extends Sample1
{
	void test()
	{
		System.out.println("test method");
	}
}
public class Program4
{
public static void main(String[] args) 
{
	Program1 p1=new Program1 ();
	System.out.println(p1.a);
	p1.test();
	System.out.println(p1.b);
	p1.run();
}
}
