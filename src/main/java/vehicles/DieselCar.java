package vehicles;

import components.*;

public class DieselCar extends Car {

    private String petrolType;
    private Windscreen windscreen;
    private SteeringWheel steeringWheel;
    private Engine engine;
    private Tyre tyre;
    private Battery battery;
    private BrakePad brakePad;

    public DieselCar(FuelType fuelType, String make, String model, int numOfDoors, double price, String petrolType, Windscreen windscreen, SteeringWheel steeringWheel, Engine engine, Tyre tyre, Battery battery, BrakePad brakePad) {
        super(fuelType, make, model, numOfDoors, price);
        this.petrolType = petrolType;
        this.windscreen = windscreen;
        this.steeringWheel = steeringWheel;
        this.engine = engine;
        this.tyre = tyre;
        this.battery = battery;
        this.brakePad = brakePad;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
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
