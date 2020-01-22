package pl.dev.java.essentials.pattern.singleton;

import java.lang.reflect.Constructor;

/**
 * Singleton pattern can be destroyed with reflection
 */
public class ReflectionExample {

    public static void destorySingleton() {
        Singleton instanceOne = Singleton.getInstance();
        Singleton instanceTwo = null;
        try {
            Constructor[] constructors = Singleton.class.getDeclaredConstructors();
            for (Constructor constructor : constructors) {

                constructor.setAccessible(true);
                instanceTwo = (Singleton) constructor.newInstance();
                break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
    }
}
