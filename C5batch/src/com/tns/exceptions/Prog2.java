package com.tns.exceptions;

import java.io.IOException;

public class Prog2 
{
	
	void m1()
	{
		System.out.println("no exception");
	}
	void m2() throws IOException
	{
		throw new IOException("device error or exception may happen");
	}
	void m3() throws ArithmeticException,IOException,ClassNotFoundException
	{
		throw new ArithmeticException("ArithmeticException may happen");
	}
	public static void main(String[] args) 
	{
		
	}
	
}
