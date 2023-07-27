package com.xworkz.setget.app;

public class Tap {

	private String brandName;
	private String color;
	private String material;
	private int noOfTaps;
	private double cost;

	@Override
	public String toString() {
		return "Brand Name:"+this.brandName + " Color:"+this.color + " Material:"+this.material + " No Of Taps:"+this.noOfTaps + " Cost:"+this.cost;
	}

	public String getBrandName() {
		return brandName;
	}

	public String getColor() {
		return color;
	}

	public double getCost() {
		return cost;
	}

	public String getMaterial() {
		return material;
	}

	public int getNoOfTaps() {
		return noOfTaps;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public void setNoOfTaps(int noOfTaps) {
		this.noOfTaps = noOfTaps;
	}
}
