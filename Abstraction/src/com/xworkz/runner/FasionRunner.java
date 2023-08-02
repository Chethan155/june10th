package com.xworkz.runner;

import com.xworkz.implementation.Accessories;
import com.xworkz.implementation.Clothing;

public class FasionRunner {

	public static void main(String[] args) {
		Clothing shirt = new Clothing();
		shirt.display();
		shirt.buy();
		shirt.wear();

		Accessories bag = new Accessories();
		bag.display();
		bag.buy();

	}

}
