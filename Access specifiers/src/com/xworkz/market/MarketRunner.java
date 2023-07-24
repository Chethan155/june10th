package com.xworkz.market;

import com.xworkz.market.base.SuperMarket;
import com.xworkz.market.base.online.OnlineMarket;

public class MarketRunner {
	
	
	
public static void main(String [] args) {
	SuperMarket supermarket = new SuperMarket();
	supermarket.sell();
	//supermarket.buy();
	
	OnlineMarket onlineMarket= new OnlineMarket();
	onlineMarket.buy();
}
}
