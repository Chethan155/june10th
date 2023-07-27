package com.xworkz.setget.app;

public class Calculator {

	
	private String name;
	private String type;
	private String companyName;
	private boolean solarPannel;
	private double cost;

	@Override
	public String toString() {
		return "Name:"+this.name + " Type:"+this.type + " Company Name:"+this.companyName + " Solar Panel:"+this.solarPannel + " Cost:"+this.cost;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getCompanyName() {
		return companyName;
	}

	public double getCost() {
		return cost;
	}

	public boolean getSolarPannel() {

		return solarPannel;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setSolarPannel(boolean solarPannel) {
		this.solarPannel = solarPannel;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
}
