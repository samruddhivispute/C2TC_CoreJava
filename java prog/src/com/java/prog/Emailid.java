package com.java.prog;



public class Emailid 
{
	private String emailid;//global
	private long refnumber;
	private long mobileno;
	public Emailid (String id, long refnumber, long mobileno)
	{
		this.emailid= emailid;//local
		this.refnumber= refnumber;
		this.mobileno= mobileno;
	}
	public long getrefnumber()
	{
		System.out.println("verify pw");
		System.out.println("confirm pw");
		return refnumber;
	}
	public long getmobileno()
	{
		System.out.println("verify pw");
		System.out.println("confirm pw");
		return mobileno;
	}
	public String getemailid()
	{
		System.out.println("verify pw");
		System.out.println("confirm pw");
		return emailid;
	}
	
	
	
	public void setrefnumber(long nc)
	{
		System.out.println("verify pw");
		System.out.println("confirm pw");
		refnumber=nc;
	}
	public void setmobileno(long ac)
	{
		System.out.println("verify pw");
		System.out.println("confirm pw");
		mobileno=ac;
	}
	public void setemailid(String na)
	{
		System.out.println("verify pw");
		System.out.println("confirm pw");
		emailid=na;
	}
	
	
}
 class Program8 
{
	public static void main(String[] args) 
	{
		Emailid  user1=new Emailid ("shubham@gmail.com",13579L,24680L);
		long num= user1.getrefnumber();
		System.out.println(num);
		long monum= user1.getmobileno();
		System.out.println(monum);
		String st= user1.getemailid();
		System.out.println(st);
		
		user1.setrefnumber(13579L);
		user1.setmobileno(24680L);
		user1.setemailid("shubham@gmail.com");
		
		long num2= user1.getrefnumber();
		System.out.println(num2);
		long monum2= user1.getmobileno();
		System.out.println(monum2);
		String st2= user1.getemailid();
		System.out.println(st2);
				
				
	}

}


