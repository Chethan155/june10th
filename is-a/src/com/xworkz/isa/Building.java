package com.xworkz.isa;

public class Building {
	    
	    String address;
	     int floors;
	    
	    public Building(String address, int floors)
	    {
	        this.address = address;
	        this.floors = floors;
	    }
	    
	    public void printInfo() {
	        System.out.println("Address: " + address);
	        System.out.println("Floors: " + floors);
	    }
	
}
