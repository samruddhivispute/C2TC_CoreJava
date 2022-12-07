package com.tns.interfacee;

interface Zomatocompany
{
	abstract void menu();
	abstract void orderonline();
	abstract void delivery();
}
class Mauj implements Zomatocompany
{
	public void menu()
	{
		System.out.println("north indian");
		System.out.println("southindian");
		System.out.println("chinese");
	}
	public void orderonline()
	{
		System.out.println("recieve by zomato");
		System.out.println("issue the order by mauj chef");
		System.out.println("mauj chef will prepare acc to their recepie");
	}
	public void delivery()
	{
		
		System.out.println("handover the food by mauj chef to delevery person");
	}
}
	
class Jalsa implements Zomatocompany
{
	public void menu()
	{
		System.out.println("oriental");
		System.out.println("snacks");
		System.out.println("dishes");
	}
	public void orderonline()
	{
		System.out.println("recieve by zomato");
		System.out.println("issue the order by jalsa chef");
		System.out.println("jalsa chef will prepare acc to their recepie");
	}
	public void delivery()
	{
		
		System.out.println("handover the food by jalsa chef to delevery person");
	}
}
class Zomatoapp
{
	Zomatocompany selectrestaurant(char ch)
	{
		if (ch=='m')
		{
			return new Mauj();
			
		}
		else 
		{
			return new Jalsa();
		}
	}
}
public class User {

	public static void main(String[] args)
	{
		Zomatoapp ref=new Zomatoapp();
		Zomatocompany zc=ref.selectrestaurant('j');
		zc.menu();
		zc.orderonline();
		zc.delivery();
		

	}

}
