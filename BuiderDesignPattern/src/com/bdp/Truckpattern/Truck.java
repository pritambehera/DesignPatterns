package com.bdp.Truckpattern;

public class Truck {
protected  String truckType;
protected int capacity;
protected String engineType;
protected String fuelType;
protected int tyer;
protected int mileage;
public Truck(int capacity, String engineType, String fuelType) {
	super();
	this.capacity = capacity;
	this.engineType = engineType;
	this.fuelType = fuelType;
}
public String getTruckType() {
	return truckType;
}
public void setTruckType(String truckType) {
	this.truckType = truckType;
}
public int getCapacity() {
	return capacity;
}
public void setCapacity(int capacity) {
	this.capacity = capacity;
}
public String getEngineType() {
	return engineType;
}
public void setEngineType(String engineType) {
	this.engineType = engineType;
}
public String getFuelType() {
	return fuelType;
}
public void setFuelType(String fuelType) {
	this.fuelType = fuelType;
}
public int getTyer() {
	return tyer;
}
public void setTyer(int tyer) {
	this.tyer = tyer;
}
public int getMileage() {
	return mileage;
}
public void setMileage(int mileage) {
	this.mileage = mileage;
}

}
