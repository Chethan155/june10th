package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.WashingMachine.Vijay;
import com.xworkz.abstraction.app.WashingMachine.WashingMachine;
import com.xworkz.abstraction.app.WashingMachine.WhirlpoolwashingMachine;

public class WahingMachineRunner {

	
	public static void main(String[] args) {
		System.out.println("Running main in Washing machine runner\n");

		WashingMachine machine = new  WhirlpoolwashingMachine();

		Vijay vijay = new Vijay(machine);
		vijay.getRinse();

	}
}
