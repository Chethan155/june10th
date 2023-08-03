package com.xworkz.interfaces.app.hotel;

public class HighfyPubRule implements PubRule {

	@Override
	public void getPartner() {
		System.out.println("Should Bring a partner");
		
	}

	@Override
	public void dontFight() {
		System.out.println("Should not fight inside Pub");		
	}

}
