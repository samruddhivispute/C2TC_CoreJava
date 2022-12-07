package com.tns.program;

public class Prog4 
{
   public static void main(String[] args)
   {
	  int x=56;
	  if (x==1)
	  {
		  System.out.println("the val of x is 1");
	  }
	  else if (x==2)
	  {
		  System.out.println("the val of x is 2");//1sec
	  }
	  else if (x==3)
	  {
		  System.out.println("the val of x is 3");//1sec
	  }
	  else 
	  {
		  System.out.println("the val of x is other than 1,2,3");//1sec
	  }
	   switch (x)
	   {
	   case 1:
		   System.out.println("the val of x is 1");
		   break;
	   case 2:
		   System.out.println("the val of x is 2");
		   break;
	   case 3:
		   System.out.println("the val of x is 3");
		   break;
		   default:
			   System.out.println("the val of x is other than 1,2,3");
			   
		   
	   }
}}
