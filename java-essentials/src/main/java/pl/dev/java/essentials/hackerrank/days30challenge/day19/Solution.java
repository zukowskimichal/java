package pl.dev.java.essentials.hackerrank.days30challenge.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;

interface AdvancedArithmetic {
    int divisorSum(int n);
}

class Calculator implements AdvancedArithmetic {
    public int divisorSum(int n) {
        Map<Integer, Integer> czynniki = rozklad(n);

        return czynniki.entrySet()
                .stream()
                .map(this::calculateSubTotal)
                .reduce((a, b) -> a * b)
                .orElseThrow(() -> new RuntimeException("Error"));
    }

    public int calculateSubTotal(Map.Entry<Integer, Integer> entry) {
        return (int) ((Math.pow(entry.getKey(), entry.getValue() + 1) - 1) / (entry.getKey() - 1));
    }

    //rozklad na czynniki pierwsze

    public Map<Integer, Integer> rozklad(int n) {
        Map<Integer, Integer> fractures = new HashMap<>();
        fractures.put(2, 0);
        int factor = 2;

        while (true) {
            if (n % factor == 0) {
                n = n / factor;
                addToMap(factor, fractures);
            } else if (n > 1) {
                factor++;
            } else {
                break;
            }
        }
        return fractures;
    }

    private void addToMap(int factor, Map<Integer, Integer> fractures) {
        if (fractures.computeIfPresent(factor, (key, value) -> value + 1) == null) {
            fractures.put(factor, 1);
        }
    }

}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.close();

        AdvancedArithmetic myCalculator = new Calculator();
        int sum = myCalculator.divisorSum(n);
        System.out.println("I implemented: " + myCalculator.getClass().getInterfaces()[0].getName());
        System.out.println(sum);
    }
}