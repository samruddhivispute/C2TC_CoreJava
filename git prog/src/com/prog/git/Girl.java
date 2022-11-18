package com.prog.git;//inheritance+method overrriding

public class Girl 
{
	void samira()
	{
		System.out.println("started studing");
	}
}
class Girl2 extends Girl
{
	void samira()
	{
		System.out.println("crack the interview");
	}
}
class Girl3 extends Girl2
{
	void samira()
	{
		System.out.println("placed");
	}
}
class Mainclass2
{
	public static void main(String[] args)
	 {
		Girl3 g1=new Girl3();
		g1.samira();
	}
}


