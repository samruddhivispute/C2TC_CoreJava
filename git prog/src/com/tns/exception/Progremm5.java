package com.tns.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Progremm5 {
	public static void main(String[] args) {
		System.out.println("welcome to java");
		System.out.println("enter a num");
		try {
			Scanner sc=new Scanner(System.in);
			int num=sc.nextInt();
			System.out.println("num="+num);
		} catch (InputMismatchException e) 
		{
			
	       e.printStackTrace();
		}
		System.out.println("hello had dinner");
		System.out.println("end the prog");
		
	}

}
