package com.enggcollege.polymorphism;

public class Electricalclass 
{
	void machine()
	{
		System.out.println("machine");
	}
}
class Microprocessor extends Electricalclass
{
	void mpkit()
	{
		System.out.println("proper connections");
	}
 
}
class Practical
{
	void performance(Electricalclass ec)
	{
		ec.machine();
	}
}
class program3
{
	public static void main(String[] args) 
    {
		Practical pr=new Practical();
		pr.performance(new Electricalclass());
		pr.performance(new Microprocessor());
		
	}
}

