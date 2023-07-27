package com.xworkz.setget.app;

public class Grinder {

	private String name;
	private String type;
	private double cost;
	private int weight;
	private int rpm;

	@Override
	public String toString() {
		return "Name:"+this.name + " Type:"+this.type + " Cost:"+this.cost + " Weight"+this.weight + " RPM:"+this.rpm;
	}

	public double getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}

	public int getRpm() {
		return rpm;
	}

	public String getType() {
		return type;
	}

	public int getWeight() {
		return weight;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setRpm(int rpm) {
		this.rpm = rpm;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

}
