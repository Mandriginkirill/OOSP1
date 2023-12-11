package Factory;

import Factory.Vehicles.Bike;
import Factory.Vehicles.Bus;
import Factory.Vehicles.Car;

public class VehicleFactory {
    public Vehicle setControl (VehiclesType vehicleType) {
        Vehicle vehicle = null;

        switch (vehicleType) {
            case CAR -> vehicle = new Car(true, false, false, false);
            case BUS -> vehicle = new Bus(true, false, false, true);
            case BIKE -> vehicle = new Bike(false, true, false, false);
        }

        return vehicle;
    }
}