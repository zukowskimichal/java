package pl.dev.java.essentials.tasks.task7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.apache.commons.lang3.tuple.ImmutablePair;

public class Task7 {

    public static void findAndPrintPairs(String values) {
        //assumption - every number can be duplicated in Pair
        String[] split = values.split(";");
        Integer sum = Integer.parseInt(split[1]);

        List<ImmutablePair<Integer, Integer>> pairs = findPairs(getNumbers(split[0]), sum);
        pairs.forEach(System.out::println);
    }

    private static List<ImmutablePair<Integer, Integer>> findPairs(Set<Integer> numbers, Integer sum) {
        List<ImmutablePair<Integer, Integer>> pairs = new LinkedList<>();
        for (Iterator<Integer> it = numbers.iterator(); it.hasNext(); ) {
            Integer number = it.next();
            if (numbers.contains(sum - number)) {
                pairs.add(new ImmutablePair<>(number, sum - number));
                it.remove();
            }
        }
        return pairs;
    }

    private static Set<Integer> getNumbers(String numbers) {
        return Stream.of(numbers
                .split(","))
                .map(Integer::new)
                .collect(Collectors.toSet());
    }
}
