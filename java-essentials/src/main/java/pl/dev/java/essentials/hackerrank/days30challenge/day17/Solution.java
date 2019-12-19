package pl.dev.java.essentials.hackerrank.days30challenge.day17;

import java.util.Scanner;

//Write your code here

class Calculator {

    static void validateValues(int... values) {
        for (int value : values) {
            if (value < 0) {
                throw new RuntimeException("n and p should be non-negative");
            }
        }

    }

    static int power(int a, int b) {
        validateValues(a,b);
        return (int) Math.pow(a,b);
    }
}

class Solution {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {

            int n = in.nextInt();
            int p = in.nextInt();
            Calculator myCalculator = new Calculator();
            try {
                int ans = myCalculator.power(n, p);
                System.out.println(ans);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        in.close();
    }
}
