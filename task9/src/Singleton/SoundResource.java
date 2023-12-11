package Singleton;

public class SoundResource implements Resource {
    private final String filename;

    public SoundResource(String filename) {
        this.filename = filename;
    }

    @Override
    public void load() {
        System.out.println("Загрузка звука: " + filename);
        // Логика загрузки звука
    }

    @Override
    public void play() {
        System.out.println("Воспроизведение звука: " + filename);
        // Логика воспроизведения звука
    }
}
