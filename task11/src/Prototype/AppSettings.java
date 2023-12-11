package Prototype;

import java.util.HashMap;
import java.util.Map;

public class AppSettings implements Cloneable {
    private Map<String, String> settings;

    public AppSettings() {
        this.settings = new HashMap<>();
    }

    public void setSetting(String key, String value) {
        settings.put(key, value);
    }

    public String getSetting(String key) {
        return settings.get(key);
    }

    @Override
    public AppSettings clone() throws CloneNotSupportedException {
        AppSettings clonedSettings = (AppSettings) super.clone();
        clonedSettings.settings = new HashMap<>(this.settings);
        return clonedSettings;
    }
}