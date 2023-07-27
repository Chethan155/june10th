package com.xworkz.setget.app;

public class HeadSet {

	
	private String brandName;
	private String type;
	private int driverSize;
	private double bluetoothVersion;
	private double cost;

	@Override
	public String toString() {
		return "Brand Name:"+this.brandName + " Type:"+this.type + " Driver Size:"+this.driverSize + " Bluetooth Version:"+this.bluetoothVersion + " Cost:"+this.cost;

	}

	public double getBluetoothVersion() {
		return bluetoothVersion;
	}
	public String getBrandName() {
		return brandName;
	}

	public double getCost() {
		return cost;
	}

	public int getDriverSize() {
		return driverSize;
	}

	public String getType() {
		return type;
	}

	public void setBluetoothVersion(double bluetoothVersion) {
		this.bluetoothVersion = bluetoothVersion;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public void setDriverSize(int driverSize) {
		this.driverSize = driverSize;
	}

	public void setType(String type) {
		this.type = type;
	}

}
