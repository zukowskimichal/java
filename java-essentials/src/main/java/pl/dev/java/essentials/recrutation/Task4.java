package pl.dev.java.essentials.recrutation;

import java.util.LinkedList;
import java.util.List;

public class Task4 {

    //Arrange coins in rows each row can have one more coin check how many full rows you can get with given number of coins

    public static void main(String[] args) {
        List<Long> list = new LinkedList<>();
        list.add(1L);
        list.add(2L);
        list.add(3L);
        list.add(4L);
        list.add(5L);
        list.add(6L);
        list.add(7L);
        list.add(8L);
        list.add(8123123123L);
        list.add(812234562623L);
        arrangeCoins(list);

    }

    public static void arrangeCoins(List<Long> coins) {
        coins.forEach(number -> {
            System.out.println("firstFubction " + checkIfGreater(number));
            System.out.println("secondFunction " + findRows(number));
        });
    }

    private static int checkIfGreater(Long number) {

        int rows = 0;
        int sum = 0;
        for (int i = 1; i <= number; i++) {
            sum += 1 + (i - 1);
            if (sum > number) {
                return rows;
            } else if (sum == number) {
                rows += 1;
                return rows;
            } else {
                rows += 1;
            }
        }
        return rows;
    }

    private static int findRows(Long number) {
        double sqrDelta = Math.sqrt(1 + 8 * number);
        double x1 = (double) (-4 * number) / (-1.0 - sqrDelta);
        return (int) x1;
    }
}
