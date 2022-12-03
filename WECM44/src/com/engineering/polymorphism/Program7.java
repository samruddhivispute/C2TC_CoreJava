package com.engineering.polymorphism;
	class Branch1
	{
		void arts()
		{
			System.out.println("law");
		}
	}
	class branch2 extends Branch1
	{
		void commerce()
		{
			System.out.println("b com");
		}
		void masters()
		{
			System.out.println("m com");
		}
	}
	class branch3 extends branch2
	{
		void science()
		{
			System.out.println("b sc");
		}
		
	}
	public class Program7
	{
		public static void main(String[] args) 
		{
			Branch1 b1=new branch3();
			System.out.println("b1.arts");
			
			branch2 b2=(branch2)b1;
			System.out.println("b2.arts");
			b2.commerce();
			b2.masters();
			
			branch3 b3=(branch3)b2;
			System.out.println("b3.arts");
			b3.commerce();
			b3.masters();
			b3.science();
		}
	}
