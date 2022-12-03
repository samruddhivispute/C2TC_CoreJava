package com.tns.program;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class InputDemo
{
   public static void main(String[] args) throws IOException
   {
	   
	BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter your loc and pin");
	int x=Integer.parseInt(bf.readLine());
	System.out.println("entered pincode is "+x );
	
}
}
