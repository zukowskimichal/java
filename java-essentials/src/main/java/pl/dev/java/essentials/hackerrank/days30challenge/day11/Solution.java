package pl.dev.java.essentials.hackerrank.days30challenge.day11;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        System.out.println(calculatemMaxSum(arr));
        scanner.close();
    }

    private static int calculatemMaxSum(int[][] numbers) {
        List<Integer> sums = new ArrayList<>();
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 3; j++) {
                int sum = numbers[i][j] + numbers[i][j + 1] + numbers[i][j + 2]
                        + numbers[i + 1][j + 1]
                        + numbers[i + 2][j] + numbers[i + 2][j + 1] + numbers[i + 2][j + 2];
                sums.add(sum);
            }
        }
        return sums.stream().max(Integer::compare).get();
    }

}
