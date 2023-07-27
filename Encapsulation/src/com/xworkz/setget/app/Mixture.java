package com.xworkz.setget.app;

public class Mixture {

	
	private String name;
	private String flavour;
	private String color;
	private double cost;
	private int weight;

	@Override
	public String toString() {
		return "Name:"+this.name + " Flavour:"+this.flavour + " Color:"+this.color + " Cost:"+this.cost + " Weight:"+this.weight;
	}

	public String getColor() {
		return color;
	}

	public double getCost() {
		return cost;
	}

	public String getFlavour() {
		return flavour;
	}

	public String getName() {
		return name;
	}

	public int getWeight() {
		return weight;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
}
