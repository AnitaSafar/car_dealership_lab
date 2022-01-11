package dealership;

import customer.Customer;
import vehicles.Car;
import vehicles.PetrolCar;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Car> stock;

    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<Car>();
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

    public void addCarToStock(Car car) {
        this.stock.add(car);
    }

    public int stockCount() {
        return this.stock.size();
    }

    public void sellCar(Car car, Customer customer) {
        this.stock.remove(car);
        customer.buyCar(car);
        this.till += car.getPrice();
    }
}
