package com.xworkz.interfaces.runner;

import com.xworkz.interfaces.app.airport.AirportRule;
import com.xworkz.interfaces.app.airport.BangloreAirportRule;
import com.xworkz.interfaces.app.army.ArmyRule;
import com.xworkz.interfaces.app.army.GeneralArmyRule;
import com.xworkz.interfaces.app.hotel.HighfyPubRule;
import com.xworkz.interfaces.app.hotel.NonVegHotelRule;

public class AllRunner {

	public static void main(String[] args) {
		
		
		
		System.out.println("**ArmyRule**");
		GeneralArmyRule generalArmyRule = new GeneralArmyRule();
		generalArmyRule.getHairCut();
		generalArmyRule.getUniform();
		System.out.println("Wake Up At :"+ArmyRule.WAKE_UP_AT);
		
		
		
		System.out.println("**Hotel Rule**");
		NonVegHotelRule nonVegHotelRule = new NonVegHotelRule();
		System.out.println("Hotel Type is :"+NonVegHotelRule.HOTEL_TYPE);
		nonVegHotelRule.getFood();
		nonVegHotelRule.payBill();

		
		System.out.println("**Airport Rule**");
		BangloreAirportRule bangloreAirportRule = new BangloreAirportRule();
		System.out.println("Airport Loction is :"+AirportRule.LOCATION);
		bangloreAirportRule.getPassPort();
		bangloreAirportRule.getTicket();
		
		System.out.println("**Pub Rule**");
		HighfyPubRule highfyPubRule = new HighfyPubRule();
		System.out.println("Pub opens at :"+HighfyPubRule.OPEN_TIME);
		highfyPubRule.getPartner();
		highfyPubRule.dontFight();

	}

}
