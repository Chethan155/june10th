package com.xworkz;

public class TempleRunner {

	public static void main(String[] args) {
		
		  Temple temple1 = new Temple("Mysore", 700000);
	        temple1.setName(TempleName.SARASWATHI);
	        temple1.display();

	        Temple temple2 = new Temple("Thirumala", 600000);
	        temple2.setName(TempleName.RAGAVENDRA);
	        temple2.display();
	}

}
