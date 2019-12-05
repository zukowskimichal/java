package pl.dev.java.essentials.hackerrank.days30challenge.day10;

import java.util.Comparator;
import java.util.Scanner;
import java.util.stream.Stream;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String[] ones = Integer.toBinaryString(n).split("0");
        String value = Stream.of(ones).max(Comparator.comparingInt(String::length)).get();
        System.out.println(value.length());
        scanner.close();
    }
}
