package com.xworkz.runner;

import com.xworkz.implementation.MobilePhone;
import com.xworkz.implementation.Tablet;

public class MoblieRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		MobilePhone myPhone = new MobilePhone();
		myPhone.powerOn();
		myPhone.powerOff();
		myPhone.makeCall();

		Tablet myTablet = new Tablet();
		myTablet.powerOn();
		myTablet.powerOff();
	}

}
