package Bridge;

public class Monitor implements Display{
    @Override
    public void show(String video) {
        System.out.println("Показ видео на мониторе: " + video);
    }
}