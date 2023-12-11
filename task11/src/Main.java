import Prototype.AppSettings;

public class Main {
    public static void main(String[] args) {
        try {
            AppSettings originalSettings = new AppSettings();
            originalSettings.setSetting("theme", "светлая");
            originalSettings.setSetting("language", "английский");

            AppSettings clonedSettings = originalSettings.clone();

            clonedSettings.setSetting("theme", "тёмная");
            clonedSettings.setSetting("language", "русский");

            System.out.println("Начальные настройки: ");
            printSettings(originalSettings);

            System.out.println("\nИзменённые настройки: ");
            printSettings(clonedSettings);
        } catch (CloneNotSupportedException e) {
            System.err.print("Ошибка" + e);
        }
    }

    private static void printSettings(AppSettings settings) {
        System.out.println("Theme: " + settings.getSetting("theme"));
        System.out.println("Language: " + settings.getSetting("language"));
    }
}