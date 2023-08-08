package com.xworkz.diamond.car;

public class MyCarRule implements HondaCarRule,TataCarRule {

	@Override
	public void buy() {
		System.out.println("Buying car in My car Rule");
	}

	@Override
	public void getService() {
		System.out.println("Servicing Car in My Car Rule");

	}

	@Override
	public void testDrive() {
		System.out.println("Test driving car in My Car Rule");

	}

	@Override
	public void drive() {
	System.out.println("Default Car Driving in My Car Rule.. ");
	HondaCarRule.super.drive();
	TataCarRule.super.drive();

	}

}