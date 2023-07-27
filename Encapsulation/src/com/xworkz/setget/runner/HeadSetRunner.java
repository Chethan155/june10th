package com.xworkz.setget.runner;

import com.xworkz.setget.app.HeadSet;

public class HeadSetRunner {

	public static void main(String[] args) {

		HeadSet headset = new HeadSet();
		System.out.println(headset);

		headset.setBluetoothVersion(5.2);
		headset.setBrandName("Boat");
		headset.setCost(1500);
		headset.setDriverSize(40);
		headset.setType("Wireless");

		System.out.println(headset);

	}

}
