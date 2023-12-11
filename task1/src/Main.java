import Factory.Vehicle;
import Factory.VehicleFactory;
import Factory.VehiclesType;

public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();

        Vehicle cars = vehicleFactory.setControl(VehiclesType.CAR);
        Vehicle motorcycles = vehicleFactory.setControl(VehiclesType.BUS);
        Vehicle bikes = vehicleFactory.setControl(VehiclesType.BIKE);
    }
}