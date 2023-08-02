package com.xworkz.implementation;

import com.xworkz.abstractclass.Vehicle;

public class Car extends Vehicle{

	
	public final void Horn() { 

		System.out.println("pam pam!");
	}

	@Override

	public void start() {
		System.out.println("Car started.");
	}
}
