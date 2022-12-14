package com.tns.lambdaexpression;

interface Lambda
{
	public void disp();
	
}

public class Prog1 {

	public static void main(String[] args)
	{
		Lambda obj=()->{
			System.out.println("i m the Trainer");
			System.out.println("i m the Trainer");
			System.out.println("i m the Trainer");
			System.out.println("i m the Trainer");
			System.out.println("i m the Trainer");
		};
		obj.disp();

	}

}
