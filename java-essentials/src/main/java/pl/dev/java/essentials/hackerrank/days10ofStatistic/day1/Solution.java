package pl.dev.java.essentials.hackerrank.days10ofStatistic.day1;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        Integer[] arrItems = Stream.of(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        calculateStandardDeviation(arrItems);

        scanner.close();
    }

    private static void calculateStandardDeviation(Integer[] arrItems) {
        double mean = (double) Stream.of(arrItems).reduce(0, Integer::sum) / arrItems.length;
        double subTotal = Stream.of(arrItems).map(x -> Math.pow(mean - x, 2)).reduce(0.0, Double::sum) / arrItems.length;
        double deviation = Math.sqrt(subTotal);
        System.out.println(deviation);
    }


}
