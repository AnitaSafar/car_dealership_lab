package customer;

import vehicles.Car;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Car> ownedCars;

    public Customer(double money, ArrayList<Car> ownedCars) {
        this.money = money;
        this.ownedCars = ownedCars;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Car> getOwnedCars() {
        return ownedCars;
    }

    public void setOwnedCars(ArrayList<Car> ownedCars) {
        this.ownedCars = ownedCars;
    }
}
