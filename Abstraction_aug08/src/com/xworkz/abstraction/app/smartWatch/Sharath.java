package com.xworkz.abstraction.app.smartWatch;

public class Sharath {

	private SmartWatch smartWatch;

	public Sharath(SmartWatch smartWatch) {
		this.smartWatch = smartWatch;
		System.out.println("smart watch arguement in Suraj");
	}

	public void getMusic() {
		if(smartWatch != null) {
			System.out.println("Watch is not null");
			this.smartWatch.music();
		}
		else {
			System.err.println("watch is null, watch not working");
		}
	}

}
