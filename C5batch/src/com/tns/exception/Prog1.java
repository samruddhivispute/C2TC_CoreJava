package com.tns.exception;

public class Prog1
{
public static void main(String[] args)
{
	int []a=new int[4];
	try {
		a[9]=50/0;
	}
	catch (ArithmeticException e)
	{
		e.printStackTrace();
	}
	catch (ArrayIndexOutOfBoundsException e)
	{
		e.printStackTrace();
	}
	catch (Exception e)
	{
		e.printStackTrace();
	}
	System.out.println("i m the last line");
}
}
