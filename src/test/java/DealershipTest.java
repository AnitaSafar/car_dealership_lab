import components.*;
import customer.Customer;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;
import vehicles.FuelType;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    Dealership dealership;
    PetrolCar car;
    Windscreen windscreen;
    SteeringWheel steeringWheel;
    Engine engine;
    Tyre tyre;
    Battery battery;
    BrakePad brakePad;
    Customer customer;

    @Before
    public void before() {
        dealership = new Dealership(20);
        windscreen = new Windscreen(50, "glass");
        steeringWheel = new SteeringWheel(15, "leather");
        engine = new Engine(1.4);
        tyre = new Tyre("summer", "60R");
        battery = new Battery(16, "VW");
        brakePad = new BrakePad("VW");
        car = new PetrolCar(FuelType.PETROL, "VW", "Polo", 5, 20, "E5", windscreen, steeringWheel, engine, tyre, battery, brakePad);
        customer = new Customer(100.5);
    }

    @Test
    public void hasMoneyInTill() {
        assertEquals(20, dealership.getTill(), 0.1);
    }

    @Test
    public void hasStock() {
        dealership.addCarToStock(car);
        assertEquals(1, dealership.stockCount());
    }

    @Test
    public void canSellCar() {
        dealership.addCarToStock(car);
        dealership.sellCar(car, customer);
        assertEquals(0, dealership.stockCount());
        assertEquals(40, dealership.getTill(), 0.1);
    }
}
