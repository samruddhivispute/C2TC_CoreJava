package com.tns.lambdaexpression;

interface Lambda
{
	abstract public int disp();
	
}

public class Prog1 {

	public static void main(String[] args)
	{
		Lambda obj=()->56+67*45-456/56;
			System.out.println(obj.disp());
		}
	
	}


