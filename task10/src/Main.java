import Facade.CarSystemFacade;

public class Main {
    public static void main(String[] args) {
        CarSystemFacade carSystem = new CarSystemFacade();

        carSystem.startCar();
        carSystem.setClimate(22);
        carSystem.playMusic("Song1");

        carSystem.stopCar();
    }
}