import Singleton.Resource;
import Singleton.ResourceManager;

public class Main {
    public static void main(String[] args) {
        ResourceManager resourceManager = ResourceManager.getInstance();

        Resource imageResource = resourceManager.getResource("image1.png", "image");
        imageResource.play();

        Resource soundResource = resourceManager.getResource("sound1.mp3", "sound");
        soundResource.play();

        Resource cachedImageResource = resourceManager.getResource("image1.png", "image");
        cachedImageResource.play();
    }
}