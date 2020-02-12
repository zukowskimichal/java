package pl.dev.java.essentials.recrutation;

import java.util.Comparator;
import java.util.List;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task3 {

    //sort number [6,5,4,3,5,2,2,1] -> [1,3,4,6,2,2,5,5]

    public static void main(String[] args) {

    }

    public static void customSort(List<Integer> arr) {
        arr.stream()
                .collect(Collectors.toMap(Function.identity(), (n) -> 1, Integer::sum))
                .entrySet()
                .stream()
                .sorted((entry1, entry2) -> comparator.compare(entry1, entry2))
                .forEach(Task3::printKeyNtimes);

    }

    static Comparator<Entry<Integer, Integer>> comparator = (entry1, entry2) -> {
        if (entry1.getValue() > entry2.getValue()) {
            return 1;
        } else if (entry1.getValue() < entry2.getValue()) {
            return -1;
        } else {
            return entry1.getKey()
                    .compareTo(entry2.getKey());
        }
    };

    static void printKeyNtimes(Entry<Integer, Integer> entry) {
        IntStream.rangeClosed(1, entry.getValue())
                .forEach((e) -> System.out.println(entry.getKey()));
    }
}
