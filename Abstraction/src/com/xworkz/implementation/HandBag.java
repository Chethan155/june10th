package com.xworkz.implementation;

import com.xworkz.abstractclass.Bag;

public class HandBag extends Bag {

	public final void carry() {
		System.out.println("Handbag carried.");
	}

	@Override
	public void display() {
		System.out.println("Handbag displayed.");
	}
}
