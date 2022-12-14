package com.tns.lambdaexpression;

interface Lambda
{
	abstract public void disp(int x);
	
}

public class Prog1 {

	public static void main(String[] args)
	{
		Lambda obj=(int x)->{
			System.out.println("value of x is: "+x);
		};
		obj.disp(56);
	
	}

}
