package com.xworkz.isa;

public class Home extends Building {
	  int bedrooms;
	  int bathrooms;
	    
	    public Home(String address, int floors, int bedrooms, int bathrooms) {
	        super(address, floors);
	        this.bedrooms = bedrooms;
	        this.bathrooms = bathrooms;
	    }
	    
	    public void printInfo() {
	        super.printInfo();
	        System.out.println("Bedrooms: " + bedrooms);
	        System.out.println("Bathrooms: " + bathrooms);
	    }
}
