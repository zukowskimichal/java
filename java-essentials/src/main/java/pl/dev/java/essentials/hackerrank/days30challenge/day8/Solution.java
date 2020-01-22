package pl.dev.java.essentials.hackerrank.days30challenge.day8;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Map<String, String> data = new HashMap<>(n);

        for (int i = 0; i < n; i++) {
            String[] keyValuPair = scanner.nextLine().split(" ");
            data.put(keyValuPair[0], keyValuPair[1]);
        }

        while (scanner.hasNext()) {
            String key = scanner.next();
            String value = data.get(key);
            if (Objects.isNull(value)) {
                System.out.println("Not found");
            } else {
                System.out.println(key + "=" + value);
            }
        }
    }

}

