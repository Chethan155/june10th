package com.xworkz.diamond.pet;

public class MyPetRule implements DogPetRule, CatPetRule {

	@Override
	public void getFood() {
		System.out.println("Giving food to pet in My Pet Rule");
	}

	@Override
	public void getSleep() {
		System.out.println("Giving sleep to pet in My Pet Rule");

	}

	@Override
	public void getWalk() {
		System.out.println("Giving Walk to pet in My Pet Rule");

	}

	@Override
	public void getBath() {
		System.out.println("Giving Bath to pet in My Pet Rule");
		CatPetRule.super.getBath();
		DogPetRule.super.getBath();
	}


}
