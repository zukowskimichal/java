package pl.dev.java.essentials.recrutation;

import java.util.Arrays;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.Pair;

public class Task2 {

    public static void main(String[] args) {
        String[][] scores = new String[][]{{"Bobby", "87"},
                {"Charles", "100"},
                {"Charles", "300"},
                {"Eric", "64"},
                {"Charles", "22"},
                {"Charles", "111"},
                {"Eric", "-10"},
                {"Eric", ""},
        };

        System.out.println(findHighestAverageFromArrayOfStudents(scores));
    }

    private static Integer findHighestAverageFromArrayOfStudents(String[][] scores) {
        return Arrays.stream(scores)
                .map(score -> Pair.of(score[0], Integer.parseInt(score[1].isEmpty() ? "0" : score[1])))
                .collect(Collectors.toMap(Pair::getKey, s -> Pair.of(1, s.getValue()),
                        (v1, v2) -> Pair.of(1 + v1.getKey(), v1.getValue() + v2.getValue())
                ))
                .values()
                .stream()
                .map(integerIntegerPair -> (int) Math.ceil((double) integerIntegerPair
                        .getValue() / integerIntegerPair
                        .getKey()))
                .max(Integer::compare)
                .orElse(0);
    }
}
