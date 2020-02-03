package pl.dev.java.essentials.tasks.task2;

import java.util.stream.IntStream;

public class Task2 {

    public static int generateSum(int number) {
        int sum = IntStream.rangeClosed(1, number)
                .filter(num -> num % 5 != 0)
                .filter(num -> num % 7 != 0)
                .sum();
        return sum;
    }
}

