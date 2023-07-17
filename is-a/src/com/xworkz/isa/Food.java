package com.xworkz.isa;

public class Food {
	  String name;
	  String origin;
	  double cost;
	  
	  
	  public Food(String name, String origin, double cost) {
	    
	    this.name=name;
	    this.origin=origin;
	    this.cost=cost;
	  
	  }
	  
	  void printInfo() {
	    System.out.println("Name : "+this.name);
	    System.out.println("Origin : "+this.origin);
	    System.out.println("Cost : "+this.cost);
	  }
	  

}
