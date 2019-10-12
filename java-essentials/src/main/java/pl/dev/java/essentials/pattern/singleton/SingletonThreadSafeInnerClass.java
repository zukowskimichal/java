package pl.dev.java.essentials.pattern.singleton;

/**
 * Lazy initialized singleton, thread safe
 * with static helper,
 */
public class SingletonThreadSafeInnerClass {


    private SingletonThreadSafeInnerClass() {
    }

    public static SingletonThreadSafeInnerClass getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private static class SingletonHelper {
        private static final SingletonThreadSafeInnerClass INSTANCE = new SingletonThreadSafeInnerClass();
    }
}
