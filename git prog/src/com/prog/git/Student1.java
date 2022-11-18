package com.prog.git;

 interface Student1
{
	int a=2;
	int s=9;
	void test(); 
}
class Student2 implements Student1
{
	public void test()
	{
	  System.out.println("test");
	}
}
class Mainclass1
{
public static void main(String[] args)
 { 
 	System.out.println(Student1.a);
 	System.out.println(Student1.s);
 	Student2 s1=new Student2();
 	s1.test();
 }

	
}


