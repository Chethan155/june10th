package com.xworkz.implementation;

import com.xworkz.abstractclass.Device;

public class MobilePhone  extends Device{

	
	public final void makeCall() {
		System.out.println("Making a call...");
	}

	@Override
	public void powerOn() {
		System.out.println("Mobile phone powered on.");
	}
}
