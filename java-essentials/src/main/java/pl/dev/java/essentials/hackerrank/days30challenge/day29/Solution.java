package pl.dev.java.essentials.hackerrank.days30challenge.day29;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine()
                    .split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            compute(n, k);
        }

        scanner.close();
    }

    private static void compute(int n, int k) {

        char[] range = Integer.toBinaryString(n)
                .toCharArray();
        char[] tempMaxValue = Integer.toBinaryString(k - 1)
                .toCharArray();

        char[] maxValue;

        if (range.length != tempMaxValue.length) {
            int shift = range.length - tempMaxValue.length;
            maxValue = Arrays.copyOf(tempMaxValue, range.length);
            for (int i = tempMaxValue.length - 1; i >= 0; i--) {
                maxValue[i + shift] = maxValue[i];
                maxValue[i] = '0';
            }
            for (int i = 0; i < shift; i++) {
                maxValue[i] = '0';
            }
        } else {
            maxValue = tempMaxValue;
        }

        compareArrays(range, maxValue);

    }

    private static void compareArrays(char[] range, char[] maxValue) {
        char[] newRange = new char[]{};
        int finalValue;
        for (int i = 0; i < range.length; i++) {
            if (maxValue[i] == '1' && range[i] != maxValue[i]) {
                newRange = convertArrayFromGivenIndex(range, i);
                break;
            }
        }
        if (newRange.length == 0) {
            newRange = range;
        }

        StringBuilder stringBuilder = new StringBuilder();
        String stringFinalValue = stringBuilder.append(String.copyValueOf(maxValue))
                .toString();
        if (Arrays.equals(newRange, maxValue)) {
            finalValue = Integer.parseInt(stringFinalValue, 2) - 1;
        } else {
            finalValue = Integer.parseInt(stringFinalValue, 2);
        }
        System.out.println(finalValue);
    }

    private static char[] convertArrayFromGivenIndex(char[] range, int i) {
        int index = findOneIndex(range, i);
        range[index] = '0';

        for (; index < range.length - 1; index++) {
            range[index + 1] = '1';
        }
        return range;
    }

    private static int findOneIndex(char[] range, int i) {
        for (; i >= 0; i--) {
            if (range[i] == '1') {
                return i;
            }
        }
        throw new RuntimeException("Wrong number");
    }
}

