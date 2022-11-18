package com.tns.inheritance;//single level

public class Swwpalnt 
{
    void menu()
    {
    	System.out.println("display the list of plants");
    }
    void order() 
    {
    	System.out.println("collect the order from thr customer");
    }
    void deliver()
    {
    	System.out.println("deliver thr order");
    }
}
class Swwpalnt2 extends Swwpalnt
{
void adaptplant()
{
	System.out.println("adapt the plant");
}
}
class MainClass
{
	public static void main(String[] args) 
	{
		Swwpalnt p1=new Swwpalnt();
		p1.menu();
		p1.order() ;
		p1.deliver();
		
		Swwpalnt2 p2=new Swwpalnt2();
		p2.adaptplant();
		p2.menu();
		p2.order() ;
		p2.deliver();
		
		
		
	}
	
}

