package Facade;

public class MusicPlayer {
    public void playMusic(String song) {
        System.out.println("Играет музыка: " + song);
    }

    public void stopMusic() {
        System.out.println("Музыка остановлена");
    }
}
