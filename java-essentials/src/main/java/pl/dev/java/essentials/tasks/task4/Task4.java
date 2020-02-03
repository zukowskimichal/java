package pl.dev.java.essentials.tasks.task4;

import java.util.Comparator;
import java.util.stream.Stream;

public class Task4 {

    private static final String SPLIT_REGEX = " ";

    public static String findFirstLongestWord(String sentence) {
        //to be considered - remove commas etc
        String[] words = sentence.split(SPLIT_REGEX);
        return Stream.of(words).max(Comparator.comparingInt(String::length)).orElse(null);
    }
}
