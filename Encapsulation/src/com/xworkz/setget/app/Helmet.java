package com.xworkz.setget.app;

public class Helmet {

	
private String name;
private String type;
private String gender;
private double cost;
private boolean isiCertified;

@Override
public String toString() {
	return "Name:"+this.name + " Type:"+this.type + " Gender:"+this.gender + " Cost:"+this.cost + " ISI Certified:"+this.isiCertified;

}

public double getCost() {
	return cost;
}
public String getGender() {
	return gender;
}
public String getName() {
	return name;
}

public String getType() {
	return type;
}

public boolean getIsiCertified() {
	return isiCertified;
}

public void setCost(double cost) {
	this.cost = cost;
}

public void setGender(String gender) {
	this.gender = gender;
}

public void setIsiCertified(boolean isiCertified) {
	this.isiCertified = isiCertified;
}

public void setName(String name) {
	this.name = name;
}

public void setType(String type) {
	this.type = type;
}
}