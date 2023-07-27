package com.xworkz.setget.app;

public class NewsPaper {

	
	private String name;
	private String language;
	private boolean color;
	private int noOfPages;
	private double cost;

	@Override
	public String toString() {
		return "Name:"+this.name + " Language:"+this.language + " Color:"+this.color + " No of Pages:"+this.noOfPages + " Cost:"+this.cost;
	}

	public double getCost() {
		return cost;
	}

	public String getLanguage() {
		return language;
	}

	public String getName() {
		return name;
	}

	public int getNoOfPages() {
		return noOfPages;
	}

	public boolean getColor() {
		return color;
	}

	public void setColor(boolean color) {
		this.color = color;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNoOfPages(int noOfPages) {
		this.noOfPages = noOfPages;
	}
}
