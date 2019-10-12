package pl.dev.java.essentials.pattern.singleton;

/**
 * Eager initialized singleton
 */
public class AntiPatternConfigurationLazy {
//TODO lazy initialized singleton not Thread safe
    private AntiPatternConfigurationLazy() {
    }

    private static final AntiPatternConfigurationLazy INSTANCE = new AntiPatternConfigurationLazy();


    public static AntiPatternConfigurationLazy getInstance() {
        return INSTANCE;
    }


}
