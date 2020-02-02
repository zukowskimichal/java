package pl.dev.java.essentials.hackerrank.days30challenge.day29;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {

    private static final Scanner scanner = new Scanner(System.in);
    private static final char ZERO = '0';
    private static final char ONE = '1';

    public static void main(String[] args) {

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine()
                    .split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);
            int result = compute(n, k);

            System.out.println(result);
        }

        scanner.close();
    }

    private static int compute(int n, int k) {

        char[] range = Integer.toBinaryString(n)
                .toCharArray();
        char[] maxValue = Integer.toBinaryString(k - 1)
                .toCharArray();

        maxValue = alignArrays(range, maxValue);

        return findMaxBitwiseAndOperationValue(range, maxValue);
    }

    private static char[] alignArrays(char[] range, char[] maxValue) {
        if (range.length != maxValue.length) {
            int shift = range.length - maxValue.length;
            int shiftingPoint = maxValue.length;
            maxValue = Arrays.copyOf(maxValue, range.length);

            for (int i = maxValue.length - 1 - shift; i >= 0; i--) {
                maxValue[i + shift] = maxValue[i];
                maxValue[i] = ZERO;
            }
            for (int i = shiftingPoint; i < shift; i++) {
                maxValue[i] = ZERO;
            }
        }
        return maxValue;
    }

    private static int findMaxBitwiseAndOperationValue(char[] range, char[] maxValue) {
        int finalValue;
        for (int i = 0; i < range.length; i++) {
            if (maxValue[i] == ONE && range[i] != maxValue[i]) {
                convertArrayFromGivenIndex(maxValue, range, i);
                break;
            }
        }

        String stringFinalValue = String.copyValueOf(maxValue);

        if (Arrays.equals(range, maxValue)) {
            return Integer.parseInt(stringFinalValue, 2) - 1;
        } else {
            return Integer.parseInt(stringFinalValue, 2);
        }
    }

    private static void convertArrayFromGivenIndex(char[] maxValue, char[] range, int i) {
        int index = findOneIndex(maxValue, range, i);
        range[index] = ZERO;

        for (; index < range.length - 1; index++) {
            range[index + 1] = ONE;
        }
    }

    private static int findOneIndex(char[] maxValue, char[] range, int i) {
        for (; i >= 0; i--) {
            if (range[i] == ONE && maxValue[i] != ONE) {
                return i;
            }
        }
        throw new RuntimeException("Wrong number");
    }
}

