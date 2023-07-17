package com.xworkz.isa;

public class City {
	  String name;
	    int noOfAreas;

	    public City(String name, int noOfAreas) {
	        this.name = name;
	        this.noOfAreas = noOfAreas;
	    }

	    public void printInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("NoOfAreas: " + noOfAreas);
	    }
}
