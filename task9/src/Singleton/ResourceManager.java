package Singleton;

import java.util.HashMap;
import java.util.Map;

public class ResourceManager {
    private static ResourceManager instance;
    private final Map<String, Resource> resourceCache;

    private ResourceManager() {
        resourceCache = new HashMap<>();
    }

    public static synchronized ResourceManager getInstance() {
        if (instance == null) {
            instance = new ResourceManager();
        }
        return instance;
    }

    public Resource getResource(String key, String type) {
        Resource resource = resourceCache.get(key);

        if (resource == null) {
            resource = switch (type) {
                case "image" -> new ImageResource(key);
                case "sound" -> new SoundResource(key);
                default -> resource;
            };

            resourceCache.put(key, resource);
            assert resource != null;
            resource.load();
        }

        return resource;
    }
}