package com.java8;

import java.util.ArrayList;
import java.util.List;

class Laptop{
	private String laptopName;
	private int ramSize;
	private double laptopPrice;
	public String getLaptopName() {
		return laptopName;
	}
	
	public Laptop(String laptopName, int ramSize, double laptopPrice) {
		super();
		this.laptopName = laptopName;
		this.ramSize = ramSize;
		this.laptopPrice = laptopPrice;
	}

	public int getRamSize() {
		return ramSize;
	}

	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}

	public double getLaptopPrice() {
		return laptopPrice;
	}

	public void setLaptopPrice(double laptopPrice) {
		this.laptopPrice = laptopPrice;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}
	
}
public class StreamUsingObject {

	public static void main(String[] args) {
		
		Laptop lap1=new Laptop("Del",8,50);
		Laptop lap2=new Laptop("MSI",16,10);
		Laptop lap3=new Laptop("Lenovo",16,10);
		Laptop lap4=new Laptop("HP",8,5);
		
		List<Laptop> lapList=new ArrayList<>();
		lapList.add(lap1);
		lapList.add(lap2);
		lapList.add(lap3);
		lapList.add(lap4);
		
		double totalLaptopCost=
				lapList.stream()
			   .mapToDouble(Laptop::getLaptopPrice)
			   .reduce(0,(a,b)->a+b);

		System.out.println("Total Cost:"+totalLaptopCost);
		
		String allLaptopNames=
				lapList.stream()
				   .map(Laptop::getLaptopName)
				   .reduce("",(a,b)->a+" "+b);
		
		System.out.println("All Laptop Names: "+allLaptopNames);

	}
}
