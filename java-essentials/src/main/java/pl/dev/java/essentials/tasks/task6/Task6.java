package pl.dev.java.essentials.tasks.task6;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Task6 {

    public static String findDuplicateHashSet(final String array) {
        String[] arrayInit = array.split(";");
        Set<String> setOfInts = new HashSet<>();


        return Stream.of(arrayInit[1]
                .split(",")).filter(number -> {
            if (setOfInts.contains(number)) {
                return true;
            } else {
                setOfInts.add(number);
                return false;
            }
        }).findFirst().orElse(null);
    }

    public static Integer findDuplicateBoolean(final String array) {
        String[] arrayInit = array.split(";");
        boolean[] booleans = new boolean[Integer.parseInt(arrayInit[0])];

        return Stream.of(arrayInit[1]
                .split(","))
                .map(Integer::new)
                .filter(number -> !(booleans[number] ^= true))
                .findFirst()
                .orElse(null);
    }
}
