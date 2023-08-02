package com.xworkz.runner;

import com.xworkz.implementation.AirRocket;
import com.xworkz.implementation.SpaceRocket;

public class RocketRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SpaceRocket spaceRocket = new SpaceRocket();
		spaceRocket.launch();
		spaceRocket.land();
		spaceRocket.deploySatellite();

		AirRocket airRocket = new AirRocket();
		airRocket.launch();
		airRocket.land();
	}

}
