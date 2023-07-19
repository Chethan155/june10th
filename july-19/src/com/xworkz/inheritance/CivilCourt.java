package com.xworkz.inheritance;

public class CivilCourt extends HighCourt {

	@Override
	void criminalCase() {

		System.out.println("Invoking criminalCase in CivilCourt");

	}

	@Override
	void forgeryCase() {

		System.out.println("Invoking forgeryCase in CivilCourt");

	}

	void propertyCase() {

		System.out.println("Invoking propertyCase in CivilCourt");

	}

	void theftCase() {

		System.out.println("invoking theftcase in civil court");
	}
	
}
