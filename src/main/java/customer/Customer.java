package customer;

import vehicles.Car;
import vehicles.PetrolCar;

import java.util.ArrayList;

public class Customer {

    private double money;
    private ArrayList<Car> ownedCars;

    public Customer(double money) {
        this.money = money;
        this.ownedCars = new ArrayList<Car>();
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

    public void addCar(Car car) {
        this.ownedCars.add(car);
    }

    public int ownedCarsCount() {
        return this.ownedCars.size();
    }
}
