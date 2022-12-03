package com.enggcollege.polymorphism;
//inheritance


class oneyear
{
	void seat()
	{
	System.out.println(" able to seat");
}
}
class  twoyear extends oneyear
{
	void stand()
	{
		System.out.println("able to stand");
	}
}
class today extends twoyear
{
	void doeverything() {
		System.out.println("able to do everything");
	}
}

public class Prog3 {
	public static void main(String[] args) 
	{
		today t1=new today();
		t1.seat();
		t1.stand();
		t1.doeverything();
	}

}
