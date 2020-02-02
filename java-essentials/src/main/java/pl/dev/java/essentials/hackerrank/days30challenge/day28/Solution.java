package pl.dev.java.essentials.hackerrank.days30challenge.day28;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Solution {

    private static final Scanner scanner = new Scanner(System.in);
    private static final Pattern pattern = Pattern.compile(".*@gmail.com$");


    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        List<String> names = new LinkedList<>();
        for (int NItr = 0; NItr < N; NItr++) {
            String[] firstNameEmailID = scanner.nextLine()
                    .split(" ");

            String firstName = firstNameEmailID[0];

            String emailID = firstNameEmailID[1];
            if (pattern.matcher(emailID)
                    .matches()) {
                names.add(firstName);
            }

        }

        names.sort(String::compareTo);
        for (String name : names) {
            System.out.println(name);
        }

        scanner.close();
    }
}
