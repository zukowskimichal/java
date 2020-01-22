package pl.dev.java.essentials.pattern.singleton;

/**
 * Eager initialized singleton
 */
public class Singleton {

    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }


}
