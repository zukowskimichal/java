package pl.dev.java.essentials.pattern.singleton;

/**
 * Eager initialized singleton
 */
public class AntiPatternConfigurationStatic {

    private AntiPatternConfigurationStatic() {
    }

    private static AntiPatternConfigurationStatic instance;

    static {
        try {
            instance = new AntiPatternConfigurationStatic();
        } catch (Exception e) {
            e.getMessage();
        }
    }




    public static AntiPatternConfigurationStatic getInstance() {
        return instance;
    }


}
