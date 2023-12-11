package Facade;

public class CarSystemFacade {
    private final Engine engine;
    private final ClimateControl climateControl;
    private final MusicPlayer musicPlayer;

    public CarSystemFacade() {
        this.engine = new Engine();
        this.climateControl = new ClimateControl();
        this.musicPlayer = new MusicPlayer();
    }

    public void startCar() {
        engine.start();
        climateControl.turnOnAC();
        System.out.println("Автомобиль готов к движению.");
    }

    public void stopCar() {
        engine.stop();
        climateControl.turnOffAC();
        musicPlayer.stopMusic();
        System.out.println("Автомобиль остановлен.");
    }

    public void setClimate(int temperature) {
        climateControl.setTemperature(temperature);
    }

    public void playMusic(String song) {
        musicPlayer.playMusic(song);
    }
}

