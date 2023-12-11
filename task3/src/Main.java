import Bridge.*;

public class Main {
    public static void main(String[] args) {
        Display tv = new Television();
        Display monitor = new Monitor();
        Display projector = new Projector();

        VideoSource onlineVideo = new OnlineVideo();
        VideoSource localVideo = new LocalVideo();

        VideoPlayer tvPlayer = new AdvancedPlayer(tv, onlineVideo);
        VideoPlayer monitorPlayer = new AdvancedPlayer(monitor, localVideo);
        VideoPlayer projectorPlayer = new AdvancedPlayer(projector, onlineVideo);

        tvPlayer.play();
        monitorPlayer.play();
        projectorPlayer.play();
    }
}