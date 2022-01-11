import components.*;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;
import vehicles.Car;
import vehicles.FuelType;
import vehicles.PetrolCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    PetrolCar car;
    Windscreen windscreen;
    SteeringWheel steeringWheel;
    Engine engine;
    Tyre tyre;
    Battery battery;
    BrakePad brakePad;

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


}
