import Observer.*;
import Observer.Person;

public class Main {
    public static void main(String[] args) {
        HealthObserver healthObserver = new HealthObserver();

        Person Oleg = new Person("Олег",1, healthObserver);
        Person Vladik = new Person("Владик", 2, healthObserver);

        healthObserver.updateHealthState(1, "Ваше здоровье ухудшилось");
    }
}