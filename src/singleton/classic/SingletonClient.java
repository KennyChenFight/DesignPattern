package singleton.classic;

import singleton.classic.Singleton;

public class SingletonClient {

    public static void main(String[] args) {
        Singleton uniqueInstance = Singleton.getInstance();
        System.out.println(uniqueInstance.getDescription());
    }
}
