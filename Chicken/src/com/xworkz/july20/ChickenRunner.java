package com.xworkz.july20;

public class ChickenRunner {

	public static void main(String[] args) {
		System.out.println("Chicken is running .....");

		Chicken ref1 = new Chicken(200, "mysuru");
		ref1.printInfo();

		Chicken ref2 = new FarmChicken(300, "mandya", 100, "Workers");
		ref2.printInfo();

		Chicken ref3 = new BoilerChicken(400, "maddhur", false, 3);
		ref3.printInfo();

	}

}
