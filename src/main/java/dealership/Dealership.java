package dealership;

import vehicles.Car;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Car> stock;

    public Dealership(double till, ArrayList<Car> stock) {
        this.till = till;
        this.stock = stock;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Car> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Car> stock) {
        this.stock = stock;
    }
}
