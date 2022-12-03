package com.enggcollege.polymorphism;
//polymorphism


class Day1
{
	void java()
	{
		System.out.println("java is difficult");
	}
}
class Day2 extends Day1
{
	void java()
	{
		System.out.println("java made easy dur to trainers");
	}
}

public class Prog2 {
	public static void main(String[] args) 
	{
		Day1 d1=new Day1();
		d1.java();
	}

}
