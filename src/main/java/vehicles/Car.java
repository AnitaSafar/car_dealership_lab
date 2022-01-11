package vehicles;

import components.*;

public abstract class Car {

    private FuelType fuelType;
    private String make;
    private String model;
    private int numOfDoors;
    private double price;

    public Car(FuelType fuelType, String make, String model, int numOfDoors, double price) {
        this.fuelType = fuelType;
        this.make = make;
        this.model = model;
        this.numOfDoors = numOfDoors;
        this.price = price;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getNumOfDoors() {
        return numOfDoors;
    }

    public void setNumOfDoors(int numOfDoors) {
        this.numOfDoors = numOfDoors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
