package Bridge;

public class OnlineVideo implements VideoSource{
    @Override
    public void playVideo() {
        System.out.println("Воспроизведение онлайн видео");
    }
}