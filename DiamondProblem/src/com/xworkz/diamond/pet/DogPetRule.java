package com.xworkz.diamond.pet;

public interface DogPetRule extends PetRule {

	void getWalk();

	@Override
	default void getBath() {
		System.out.println("Giving Bath to pet in Dog Pet Rule");
	}

}
