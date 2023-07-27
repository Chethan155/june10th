package com.xworkz.setget.app;

public class Sattelite {

	private String name;
	private double weight;
	private String material;
	private String spaceAgencyName;
	private double cost;

	@Override
	public String toString() {
		return "Name:"+this.name + " Weight:"+this.weight + " Material:"+this.material + " Sapce Agency Name:"+this.spaceAgencyName + " Cost:"+this.cost+" Crores";
	}

	public String getName() {
		return name;
	}

	public double getWeight() {
		return weight;
	}

	public String getMaterial() {
		return material;
	}

	public String getSpaceAgencyName() {
		return spaceAgencyName;
	}

	public double getCost() {
		return cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setSpaceAgencyName(String spaceAgencyName) {
		this.spaceAgencyName = spaceAgencyName;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
