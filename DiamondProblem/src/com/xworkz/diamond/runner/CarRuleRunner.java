package com.xworkz.diamond.runner;

import com.xworkz.diamond.car.CarRule;
import com.xworkz.diamond.car.HondaCarRule;
import com.xworkz.diamond.car.MyCarRule;
import com.xworkz.diamond.car.TataCarRule;

public class CarRuleRunner {
public static void main(String[] args) {
	System.out.println("Running main in Car Rule Runner\n");

	CarRule car = new MyCarRule();
	car.buy();
	car.drive();

	System.out.println(" ");

	HondaCarRule honda = new MyCarRule();
	honda.buy();
	honda.testDrive();
	honda.drive();

	System.out.println(" ");

	TataCarRule tata = new MyCarRule();
	tata.buy();
	tata.getService();
	tata.drive();

	System.out.println(" ");

	MyCarRule myCar = new MyCarRule();
	myCar.buy();
	myCar.getService();
	myCar.testDrive();
	myCar.drive();

}
}
