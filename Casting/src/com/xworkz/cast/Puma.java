package com.xworkz.cast;

public class Puma extends Shoe {
	String model;
	String origin;

	public Puma(String model, String origin, double price, ShoeColor color, ShoeSize size ) {
		super(price,color,size);
		this.model=model;
		this.origin=origin;

	}

	void printInfo() {
		System.out.println("Model : "+this.model);
		System.out.println("origin : "+this.origin);
		System.out.println("Price : "+this.price);
		System.out.println("Shoe Color : "+this.color);
		System.out.println("Shoe Size : "+this.size);
     }


}
