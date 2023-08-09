package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.elevator.Chethan;
import com.xworkz.abstraction.app.elevator.Elevator;
import com.xworkz.abstraction.app.elevator.MallElevator;

public class ElevatorRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Elevator Runner\n");

		Elevator elevator = new MallElevator();

		Chethan chethan = new Chethan(elevator);
		chethan.getCarry();
	}
}
