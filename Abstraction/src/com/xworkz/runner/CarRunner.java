package com.xworkz.runner;

import com.xworkz.implementation.Car;
import com.xworkz.implementation.Truck;

public class CarRunner {
	
	
			public static void main(String[] args) {
	        Car myCar = new Car();
	        myCar.start();
	        myCar.stop();
	        myCar.Horn();

	        Truck myTruck = new Truck();
	        myTruck.start();
	        myTruck.stop();
	    }

}
