package com.xworkz.implementation;

import com.xworkz.abstractclass.FasionItem;

public class Clothing extends FasionItem {
	
	public final void wear() {
		System.out.println("Clothing item worn.");
	}

	@Override
	public void display() {
		System.out.println("Clothing item displayed.");
	}

}
