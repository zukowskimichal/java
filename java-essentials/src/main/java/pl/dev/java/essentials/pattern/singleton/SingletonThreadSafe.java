package pl.dev.java.essentials.pattern.singleton;

import java.util.Objects;

/**
 * Lazy initialized singleton, thread safe
 * reduced performance due to the associated with synchronized method
 */
public class SingletonThreadSafe {

    private static SingletonThreadSafe instance;

    private SingletonThreadSafe() {
    }

    public static synchronized SingletonThreadSafe getInstance() {
        return Objects.isNull(instance) ? new SingletonThreadSafe() : instance;
    }
}
