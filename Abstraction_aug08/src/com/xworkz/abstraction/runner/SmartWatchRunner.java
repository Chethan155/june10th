package com.xworkz.abstraction.runner;

import com.xworkz.abstraction.app.smartWatch.BoatSmartWatch;
import com.xworkz.abstraction.app.smartWatch.Sharath;
import com.xworkz.abstraction.app.smartWatch.SmartWatch;

public class SmartWatchRunner {

	public static void main(String[] args) {
		System.out.println("Running main in Smart watch Runner\n");

		SmartWatch smartWatch = new BoatSmartWatch();

		Sharath sharath = new Sharath(smartWatch);
		sharath.getMusic();

	}
}
