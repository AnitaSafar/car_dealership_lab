import components.*;
import customer.Customer;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.FuelType;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class CustomerTest {

    Customer customer;
    PetrolCar car;
    PetrolCar car2;
    Windscreen windscreen;
    SteeringWheel steeringWheel;
    Engine engine;
    Tyre tyre;
    Battery battery;
    BrakePad brakePad;
    Dealership dealership;

    @Before
    public void before() {
        customer = new Customer(100.5);
        windscreen = new Windscreen(50, "glass");
        steeringWheel = new SteeringWheel(15, "leather");
        engine = new Engine(1.4);
        tyre = new Tyre("summer", "60R");
        battery = new Battery(16, "VW");
        brakePad = new BrakePad("VW");
        car = new PetrolCar(FuelType.PETROL, "VW", "Polo", 5, 20, "E5", windscreen, steeringWheel, engine, tyre, battery, brakePad);
        car2 = new PetrolCar(FuelType.PETROL, "VW", "Polo", 5, 101, "E5", windscreen, steeringWheel, engine, tyre, battery, brakePad);
        dealership = new Dealership(20);
    }

    @Test
    public void customerHasMoney() {
        assertEquals(100.5, customer.getMoney(), 0.1);
    }

    @Test
    public void canAddCar() {
        customer.addCar(car);
        assertEquals(1, customer.ownedCarsCount());
    }

    @Test
    public void canAffordCar() {
        assertEquals(true, customer.hasEnoughMoney(car));
        assertEquals(false, customer.hasEnoughMoney(car2));
    }

    @Test
    public void canBuyACar() {
        customer.buyCar(car);
        assertEquals(1, customer.ownedCarsCount());
        assertEquals(80.5, customer.getMoney(), 0.1);
    }



}
