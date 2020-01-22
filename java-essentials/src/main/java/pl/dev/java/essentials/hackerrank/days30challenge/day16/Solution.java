package pl.dev.java.essentials.hackerrank.days30challenge.day16;

public class Solution {
   static  void parseToIntOrPrintMessage(String value) {
        try {
            Integer valueInteger = Integer.parseInt(value);
            System.out.println(value);
        } catch (NumberFormatException e) {
            System.out.println("Bad String");
        }

    }
}
