package pl.dev.java.essentials.hackerrank.days30challenge.day26;

import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer[] actualDate = Stream.of(in.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        Integer[] expectedDate = Stream.of(in.nextLine()
                .split(" "))
                .map(Integer::parseInt)
                .toArray(Integer[]::new);

        if (hasReturnedEarlierOrOnTime(expectedDate, actualDate)) {
            System.out.println(0);
        } else {

            if (lateForMoreThanAYear(expectedDate[2], actualDate[2])) {
                System.out.println(10000);
            } else if (lateforMoreThanAMonth(expectedDate[1], actualDate[1])) {
                int difference = actualDate[1] - expectedDate[1];
                System.out.println(difference * 500);
            } else {

                int difference = actualDate[0] - expectedDate[0];
                System.out.println(difference * 15);
            }
        }

    }

    private static boolean hasReturnedEarlierOrOnTime(Integer[] expectedDate, Integer[] actualDate) {
        boolean yearExpected = expectedDate[2].compareTo(actualDate[2]) > 0;
        boolean sameYear = expectedDate[2].compareTo(actualDate[2]) == 0;
        boolean monthExpected = sameYear && expectedDate[1].compareTo(actualDate[1]) >= 0;
        boolean dayExpected = expectedDate[0].compareTo(actualDate[0]) >= 0;
        return yearExpected || monthExpected && dayExpected;
    }

    private static boolean lateForMoreThanAYear(Integer expectedYear, Integer actualYear) {
        return expectedYear.compareTo(actualYear) < 0;
    }

    private static boolean lateforMoreThanAMonth(Integer expectedMoth, Integer actualMonth) {
        return expectedMoth.compareTo(actualMonth) < 0;
    }

}


