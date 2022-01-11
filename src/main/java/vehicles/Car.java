package vehicles;

import components.*;

public class Car {

    private FuelType fuelType;
    private String make;
    private String model;
    private int numOfDoors;
    private double price;
    private Windscreen windscreen;
    private SteeringWheel steeringWheel;
    private Engine engine;
    private Tyre tyre;
    private Battery battery;
    private BrakePad brakePad;

    public Car(FuelType fuelType, String make, String model, int numOfDoors, double price, Windscreen windscreen, SteeringWheel steeringWheel, Engine engine, Tyre tyre, Battery battery, BrakePad brakePad) {
        this.fuelType = fuelType;
        this.make = make;
        this.model = model;
        this.numOfDoors = numOfDoors;
        this.price = price;
        this.windscreen = windscreen;
        this.steeringWheel = steeringWheel;
        this.engine = engine;
        this.tyre = tyre;
        this.battery = battery;
        this.brakePad = brakePad;
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

    public Windscreen getWindscreen() {
        return windscreen;
    }

    public void setWindscreen(Windscreen windscreen) {
        this.windscreen = windscreen;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public void setSteeringWheel(SteeringWheel steeringWheel) {
        this.steeringWheel = steeringWheel;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public Battery getBattery() {
        return battery;
    }

    public void setBattery(Battery battery) {
        this.battery = battery;
    }

    public BrakePad getBrakePad() {
        return brakePad;
    }

    public void setBrakePad(BrakePad brakePad) {
        this.brakePad = brakePad;
    }
}
