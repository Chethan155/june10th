package com.xworkz.cast;

public class Nike extends Shoe {
	String ceo;
	String brandAmbassador;

	public Nike(String ceo, String brandAmbassador, double price, ShoeColor color, ShoeSize size) {
		super(price,color,size);
		this.ceo=ceo;
		this.brandAmbassador=brandAmbassador;
}
	void printInfo() {
		System.out.println("CEO : "+this.ceo);
		System.out.println("Brandambassador : "+this.brandAmbassador);
		System.out.println("Price : "+this.price);
		System.out.println("Shoe Color : "+this.color);
		System.out.println("Shoe Size : "+this.size);
	}
}
