package com.prog.git;//this keyword

public class Prog5 //Ac 
{
	float length;
	int price;
	String company;
	char colour;
	Prog5(float length,int price,String company,char colour)
  {
  	System.out.println("order successfull");
  	this.length=length;
  	this.price=price;
  	this.company=company;
  	this.colour=colour;
  }
  }
	
   class Mainclass2
   {
   public static void main(String[] args)
    {
	   Prog5 a1=new Prog5(1.5f,43000,"daikin",'w');
   	   System.out.println(a1.length);
   	   System.out.println(a1.price);
   	   System.out.println(a1.company);
   	   System.out.println(a1.colour);

   	Prog5 a2=new Prog5(1.0f,42000,"LG",'g');
   	   System.out.println(a2.length);
   	   System.out.println(a2.price);
   	   System.out.println(a2.company);
   	   System.out.println(a2.colour);

   	Prog5 a3=new Prog5(2.0f,40000,"onida",'b');
   	   System.out.println(a3.length);
   	   System.out.println(a3.price);
   	   System.out.println(a3.company);
   	   System.out.println(a3.colour);
   	}
   }


