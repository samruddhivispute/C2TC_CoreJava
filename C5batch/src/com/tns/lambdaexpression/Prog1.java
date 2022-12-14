package com.tns.lambdaexpression;

interface Lambda
{
	public void disp();
	
}

public class Prog1 {

	public static void main(String[] args)
	{
		
	new Thread(()->
			
			{
				System.out.println("This is one Thread");
			}).start();
	}

}
