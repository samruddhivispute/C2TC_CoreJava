package com.work.polymorphism;

class onlinepayment
{
	String scan="qrcode";
	void scan()
	{
		System.out.println("scan for payment");
	}
}
class Mobile
{
	void balence(onlinepayment ref)
	{
		System.out.println(ref.scan);
		ref.scan();
	}
}
class Program4
{
	public static void main(String[]args)
	{
		Mobile mo=new Mobile();
		mo.balence(new onlinepayment());
		
	}
}

