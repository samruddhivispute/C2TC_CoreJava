package com.tns.inheritance;
//multiple inheritance

interface Father 
{
	void study();

}
interface Mother 
{
	void study();

}
class You implements Father,Mother
{
public void study()
{
	System.out.println("study.....");
}
}
class Mainclass
{
public static void main(String[] args) {
	You ref=new You();
	ref.study();
}
}

