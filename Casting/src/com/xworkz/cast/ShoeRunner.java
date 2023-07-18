package com.xworkz.cast;

public class ShoeRunner {

	public static void main(String[] args) {
		System.out.println("Running main in ShoeRunner");

		Shoe shoe1 = new Shoe(6500, ShoeColor.BLACK, ShoeSize.SIX);
		ShoeUtil.check(shoe1);

		Shoe shoe2 = new Puma("Casuals", "India", 7500, ShoeColor.GRAY, ShoeSize.EIGHT);
		ShoeUtil.check(shoe2);

		Shoe shoe3 = new Nike("John Donahoe", "Rory Mcllory", 8000, ShoeColor.WHITE, ShoeSize.NINE);
		ShoeUtil.check(shoe3);
	}

	

}
