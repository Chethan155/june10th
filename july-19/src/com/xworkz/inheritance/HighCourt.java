package com.xworkz.inheritance;

public class HighCourt extends SupremeCourt {
	
	
	@Override
	void importantCase() {

		System.out.println("Invoking importantCase in High Court");


	}

	void criminalCase() {

		System.out.println("Invoking criminalCase in HighCourt");

	}

	void forgeryCase() {

		System.out.println("Invoking forgeryCase in HighCourt");

	}
}
