package singleton.doublechecklock;

public class Singleton {

    private static volatile Singleton uniqueInstance;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new Singleton();
                }
            }
        }
        return uniqueInstance;
    }

    // other useful methods here
    public String getDescription() {
        return "I'm a double check lock Singleton!";
    }
}
