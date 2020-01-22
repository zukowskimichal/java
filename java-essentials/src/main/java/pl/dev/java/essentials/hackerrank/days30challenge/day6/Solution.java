package pl.dev.java.essentials.hackerrank.days30challenge.day6;

import java.util.Scanner;

public class Solution {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfTests = Integer.parseInt(scanner.next());

        for (int i = 0; i < numberOfTests; i++) {
            String nextWord = scanner.next();
            printCrazyStuff(nextWord);
        }
        scanner.close();
    }

    private static void printCrazyStuff(String nextLine) {
        StringBuilder even = new StringBuilder();
        StringBuilder odd = new StringBuilder();

        for (int i = 0; i < nextLine.length(); i++) {
            if (i % 2 == 0) {
                even.append(nextLine.charAt(i));
            } else {
                odd.append(nextLine.charAt(i));
            }
        }
        System.out.println(even.toString() + " " + odd.toString());

    }
}
