package com.xworkz;

public class Temple {
	TempleName name;
	String location;
	String priest="poojari";
	int donation;
	
	
	void setName(TempleName name) {
		this.name=name;
		
	}

	Temple(String location, int donation){
		
		this.donation=donation;
		this.location=location;
		
	}
	
	void display() {
		System.out.println("Name of the temple "+this.name+"Temple");
		System.out.println("Temple location : "+this.location);
		System.out.println("pooja is done by "+priest);
		System.out.println("Total donation : "+this.donation);
	}
}
