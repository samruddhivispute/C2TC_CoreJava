package com.prog.git;//method overloadding

public class Prog6 
{
	void mobile(String a)
	{
	System.out.println("mi mob will be booked");

}
  void mobile()
  {
  System.out.println("nokia mob will be ordered");
  }

  void mobile(char c,float d)
  {
  	System.out.println("mob book & money paid");
  }

  void mobile(float r)
  {
  	System.out.println("payment is done");
  }

  class Mainclass1
  {
  	public static void main(String[] args) 
  	{
  		Prog6  o1=new Prog6 ();
  		o1.mobile('v',11.5f);
  	}
  }

}
