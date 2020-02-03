package pl.dev.java.essentials.tasks.task5;

import java.util.stream.Stream;

public class Task5 {

    public static String reverseWordsInSentence(String sentence) {
        StringBuilder stringBuilder = new StringBuilder();

        return Stream.of(sentence.split(" "))
                .map(word -> new StringBuilder(word).reverse())
                .reduce(stringBuilder,
                        (outcome, buffer) -> outcome.append(buffer.toString()).append(" "))
                .toString()
                .trim();
    }
}
