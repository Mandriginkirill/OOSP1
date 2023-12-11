package Bridge;

public class AdvancedPlayer extends VideoPlayer{
    private final VideoSource videoSource;

    public AdvancedPlayer(Display display, VideoSource videoSource) {
        super(display);
        this.videoSource = videoSource;
    }

    @Override
    public void play() {
        videoSource.playVideo();
        display.show("Воспроизведение видео");
    }
}