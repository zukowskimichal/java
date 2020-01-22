package pl.dev.java.essentials.hackerrank.days30challenge.day7;

import java.util.Scanner;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            stringBuilder.append(arr[i]).append(" ");
        }
        System.out.println(stringBuilder.toString().trim());

        scanner.close();
    }
}
