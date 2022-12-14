package com.tns.generics;

import java.util.ArrayList;
import java.util.List;

class KIA
{
	private int vehicle;

	public KIA(int vehicle) {
		super();
		this.vehicle = vehicle;
	}

	public int getVehicle() {
		return vehicle;
	}

	@Override
	public String toString() {
		return "KIA [vehicle=" + vehicle + "]";
	}
}
class Seltos extends KIA
{
	private String CarModel;

	public Seltos(int vehicle, String carModel) {
		super(vehicle);
		CarModel = carModel;
	}

	
	public String toString() {
		return "Seltos [CarModel=" + CarModel + "]";
	}

	public String getCarModel() {
		return CarModel;
	}
	
}

public class Prog3 {
	public static void disp(List<?>list)
	{
		for(Object i:list)
		{
			System.out.println(i);
		}
	}

	public static void main(String[] args)
	{
		List<Object> list=new ArrayList<>();
		
		list.add(new KIA(1));
		list.add(new KIA(2));
		list.add(new KIA(3));
		list.add(new KIA(4));
		list.add(new KIA(5));
		list.add(new Seltos(1,"Seltos"));
		list.add(new Seltos(2,"sonet"));
		
		disp(list);

	}

}
