package com.prog.git;//abstarct keyword

abstract class Criket 
	{
	   abstract void testmatch();
	   abstract void quarterfinal();
	   abstract void semifinal();
	   abstract void finalmatch();

	}
	abstract class Day1 extends Criket
	{
		void testmatch()
		{
			System.out.println("test match will be done");
		}
	}

	abstract class Day2 extends Day1
	{
		void quarterfinal()
		{
			System.out.println("quarter final will be done");
		}

	}
	abstract class Day3 extends Day2
	{
	     void semifinal()
	     {
	     	System.out.println("semifinal is done");
	     }
	}
	abstract class Day4 extends Day3
	{
	     
	}

	class Day5 extends Day4
	{
		void finalmatch()
		{
			System.out.println("final match is done");
		}
	}
	class Mainclass1
	{
		public static void main(String[] args) 
		{
		   Day5 res=new Day5();
		   res.testmatch();
		   res.quarterfinal();
		   res.semifinal();
		   res.	finalmatch();
		}
	}



