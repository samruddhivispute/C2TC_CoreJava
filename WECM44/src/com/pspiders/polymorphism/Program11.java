package com.pspiders.polymorphism;
interface amazon
{
	void module();
	void addtocart();
	void delivery();
}

class fastrack implements amazon
{
	public void module()
	{
		System.out.println("sportswear");
	}
	public void addtocart()
	{
		System.out.println("fastrack will pack the product");
	}
	public void delivery()
	{
		System.out.println("deliver the product on address");
	}
}

class titan implements amazon
{
	public void module()
	{
		System.out.println("sportswear");
	}
	public void addtocart()
	{
		System.out.println("titan will pack the product");
	}
	public void delivery()
	{
		System.out.println("deliver the product on address");
	}
}

class amazonapp
{
	amazon shop(char select)
	{
		if(select=='T')
		{
			return new titan();
		}
		else
		{
			return new fastrack();
		}
	}
}


public class Program11 
{
	public static void main(String[] args) 
	{
		amazonapp ref=new amazonapp();
		amazon az=ref.shop('T');
		az.module();
		az.addtocart();
		az.delivery();
		
	}
}













