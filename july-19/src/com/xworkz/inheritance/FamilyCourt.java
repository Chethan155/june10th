package com.xworkz.inheritance;

public class FamilyCourt extends CivilCourt {

	@Override
	void propertyCase() {

		System.out.println("Invoking propertyCase in FamilyCourt");

	}

	@Override
	void theftCase() {

		System.out.println("Invoking theftCase in FamilyCourt");

	}

	void divorce() {

		System.out.println("Invoking divorce in FamilyCourt");

	}
}
