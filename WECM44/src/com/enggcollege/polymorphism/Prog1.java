package com.enggcollege.polymorphism;
//abstraction
 interface Mesho
 {
	void modules();
	 void collectorder();
	 void delever();
 }
 class Myra implements Mesho
 {
	     public void modules()
	     {
		 System.out.println("womwns");
		 }
		 public void collectorder()
		 {
			 System.out.println("saree");
		 }
		 public void delever()
		 {
		 System.out.println("myra deliver");
	     }
 }
 
		 class Ramond implements Mesho
		 {
			 public void modules()
		     {
			 System.out.println("womwns");
			 }
			 public void collectorder()
			 {
				 System.out.println("saree");
			 }
			 public void delever()
			 {
			 System.out.println("ramond deliver");
			 }
		 }
		 
		 class Meshoapp
			 {
				Mesho searchproduct (char ch)
				{
					if (ch=='m')
					{
						return new Myra();
					}
					else
					{
						return new Ramond();
					}
				}
			 }
		 

public class Prog1 
{
	public static void main(String[] args) 
	{
	Meshoapp ref=new Meshoapp();
	Mesho ms=ref.searchproduct('m');
	ms.modules();
	ms.collectorder();
	ms.delever();
}
}
		 
		 


