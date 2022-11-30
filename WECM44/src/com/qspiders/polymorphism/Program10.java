package com.qspiders.polymorphism;
class network
{
	void sim()
	{
		System.out.println("communication");
	}
}

class mobile1 extends network
{
	void sim()
	{
		System.out.println("bsnl");
	}
}

class mobile2 extends network
{
	void sim()
	{
		System.out.println("airtel");
	}
}
class mobile3 extends network
{
	void sim()
	{
		System.out.println("vodafone");
	}
}

class coverage
{
	void range(network ref)
	{
		ref.sim();
	}
}

public class Program10 
{
	public static void main(String[] args) 
	{
		coverage ref=new coverage();
		ref.range(new mobile1());
		ref.range(new mobile2());
		ref.range(new mobile3());
	}
}
