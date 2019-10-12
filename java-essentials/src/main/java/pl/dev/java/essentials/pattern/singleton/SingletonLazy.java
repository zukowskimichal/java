package pl.dev.java.essentials.pattern.singleton;

import java.util.Objects;

/**
 * Lazy initialized singleton, not thread safe
 */
public class SingletonLazy {

    private static SingletonLazy instance;

    private SingletonLazy() {
    }

    public static SingletonLazy getInstance() {
        return Objects.isNull(instance) ? new SingletonLazy() : instance;
    }
}
