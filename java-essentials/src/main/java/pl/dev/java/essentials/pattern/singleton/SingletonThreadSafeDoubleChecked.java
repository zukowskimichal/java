package pl.dev.java.essentials.pattern.singleton;

/**
 * Lazy initialized singleton, thread safe
 * optimised performance with double checked locking pattern
 */
public class SingletonThreadSafeDoubleChecked {

    private static SingletonThreadSafeDoubleChecked instance;

    private SingletonThreadSafeDoubleChecked() {
    }

    public static synchronized SingletonThreadSafeDoubleChecked getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafeDoubleChecked.class) {
                if (instance == null) {
                    return new SingletonThreadSafeDoubleChecked();
                }
            }
        }
        return instance;
    }
}
