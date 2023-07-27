package com.xworkz.setget.runner;

import com.xworkz.setget.app.Mixture;

public class MixtureRunner {

	public static void main(String[] args) {
	
		Mixture mixture = new Mixture();
		System.out.println(mixture);

		mixture.setColor("Orange");
		mixture.setCost(500);
		mixture.setFlavour("Mint");
		mixture.setName("Aloo Bhujia");
		mixture.setWeight(100);

		System.out.println(mixture);


	}

}
