package com.xworkz.diamond.car;

public interface HondaCarRule extends CarRule {

	void testDrive();

    @Override
	default void drive() {
		System.out.println("Default Car driving in Honda Car Rule... ");
	}

}
