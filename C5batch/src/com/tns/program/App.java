package com.tns.program;//single inheritance
class superclass
{
	void disp()
	{
		System.out.println("i m from superclass ");
	}
}
class subclass extends superclass
{
	void run()
	{
		System.out.println("i m from subclass ");
	}
}
class subclass2 extends subclass
{
	void test()
	{
		System.out.println("i m from subclass2 ");
	}
}


public class App extends subclass2 
{
	public static void main(String[] args) 
	{
		subclass2 s1=new subclass2();
		s1.disp();
		s1.run();
		s1.test();
	}

}
