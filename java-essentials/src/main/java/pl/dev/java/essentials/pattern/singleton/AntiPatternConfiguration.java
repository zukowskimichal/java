package pl.dev.java.essentials.pattern.singleton;

/**
 * Eager initialized singleton
 */
public class AntiPatternConfiguration {

    private AntiPatternConfiguration() {
    }

    private static final AntiPatternConfiguration INSTANCE = new AntiPatternConfiguration();


    public static AntiPatternConfiguration getInstance() {
        return INSTANCE;
    }


}
