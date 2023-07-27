package com.xworkz.setget.app;

public class Dosa {

	
	private String name;
	private String color;
	private String type;
	private double cost;
	private int noOfDosas;

	public String getColor() {
		return color;
	}

	public double getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}

	public int getNoOfDosas() {
		return noOfDosas;
	}

	public String getType() {
		return type;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNoOfDosas(int noOfDosas) {
		this.noOfDosas = noOfDosas;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Name:"+this.name  +" Color:" +this.color +" Type:"+this.type + " Cost:"+this.cost + " No of Dosas:"+this.noOfDosas;
	}

}
