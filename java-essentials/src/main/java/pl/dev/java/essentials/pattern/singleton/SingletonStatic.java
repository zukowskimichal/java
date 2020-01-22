package pl.dev.java.essentials.pattern.singleton;

/**
 * statically initialized singleton
 */
public class SingletonStatic {

    private static SingletonStatic instance;

    static {
        try {
            instance = new SingletonStatic();
        } catch (Exception e) {
            e.getMessage();
        }
    }

    private SingletonStatic() {
    }

    public static SingletonStatic getInstance() {
        return instance;
    }


}
