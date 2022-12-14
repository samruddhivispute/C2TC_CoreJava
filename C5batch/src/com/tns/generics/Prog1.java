package com.tns.generics;



class Data_generic<K extends Integer,V extends String>
{
	private K key;
	private V value;
	@Override
	public String toString() {
		return "Data_generic [key=" + key + ", value=" + value + "]";
	}
	public K getKey() {
		return key;
	}
	public V getValue() {
		return value;
	}
	public Data_generic(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	}
}


public class Prog1 {

	public static void main(String[] args) 
	{
		Data_generic<Integer,String> obj_generic=new Data_generic<Integer,String>(67,"Samruddhi");
		
		System.out.println("key:"+obj_generic.getKey()+ " "+"value:"+obj_generic.getValue());
		obj_generic.display('b', 45);

	}

}
