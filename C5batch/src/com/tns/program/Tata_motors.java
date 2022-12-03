package com.tns.program;
abstract class Mumbai_Rules
{
	abstract void speedLimit();
	abstract void rashDriving();
	abstract void rule3();
	void slower_moving()
	
	{
		System.out.println("no fine for slower");
	}
	void electric()
	{
		System.out.println("no helmet");
	}
}


class seltos extends Mumbai_Rules
{
	
	void speedLimit()
	{
		System.out.println("speed limit is 80");
	}
	void rashDriving()
	{
		System.out.println("Alert voice");
	}
	void rule3()
	{
		System.out.println("Alert voice");
	}

	void speed()
	{
		System.out.println("speed is 190");
	}
}
class sonet
{
	void speed()
	{
		System.out.println("speed is 180");
	}
}
class carnival
{
	void speed()
	{
		System.out.println("speed is 160");
	}
}


public class Tata_motors 
{
	public static void main(String[] args) 
	{
		seltos sl=new seltos();
		sl.speedLimit();
		sl.slower_moving();
		sl.rashDriving();
		sl.electric();
	}
}
	

