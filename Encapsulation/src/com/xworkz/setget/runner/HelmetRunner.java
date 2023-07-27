package com.xworkz.setget.runner;

import com.xworkz.setget.app.Helmet;

public class HelmetRunner {

	public static void main(String[] args) {
		
		Helmet helmet = new Helmet();
		System.out.println(helmet);

		helmet.setCost(1000);
		helmet.setGender("Male");
		helmet.setIsiCertified(true);
		helmet.setName("Vega");
		helmet.setType("Sports");

		System.out.println(helmet);

	}

}
