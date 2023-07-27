package com.xworkz.setget.runner;

import com.xworkz.setget.app.Dosa;

public class DosaRunner {

	public static void main(String[] args) {
		
		
		Dosa dosa = new Dosa();
		System.out.println(dosa.toString());

		dosa.setColor("White");
		dosa.setCost(50);
		dosa.setName("Set Dosa");
		dosa.setNoOfDosas(4);
		dosa.setType("Set Dosa");

		System.out.println(dosa);

	}

}
