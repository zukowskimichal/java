package pl.dev.java.essentials.recrutation;

public class Task1 {

    public static void main(String[] args) {

        int[] numbers = new int[]{1, 2, 3, 4, 2, 123, 12, 31, 23, -1, 2, 3, 0, 0,};
        System.out.println(findSecondSmallest(numbers));
    }

    private static int findSecondSmallest(int[] numbers) {
        int smallest = numbers[0];
        int secondSmallest = numbers[1];

        for (int number : numbers) {
            if (smallest > number) {
                secondSmallest = smallest;
                smallest = number;
            } else if (number < secondSmallest && number != smallest) {
                secondSmallest = number;
            }
        }
        return secondSmallest;

    }

}
