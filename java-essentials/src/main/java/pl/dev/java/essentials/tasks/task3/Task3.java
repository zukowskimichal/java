package pl.dev.java.essentials.tasks.task3;

import java.util.HashSet;
import java.util.Set;

public class Task3 {

    private static final Set<Character> ODD = new HashSet<>();
    private static final Character ZERO = '0';

    static {
        ODD.add('1');
        ODD.add('3');
        ODD.add('5');
        ODD.add('7');
        ODD.add('9');
    }

    public static String checkOddEven(String inputLine) {
        //assume inputLine is a number
        char[] charArray = inputLine.toCharArray();

        StringBuilder stringBuilder = initializeStringBuilderWithFirstChar(charArray);

        for (int i = 0; i < charArray.length - 1; i++) {
            buildString(stringBuilder, charArray, i);
        }
        return stringBuilder.toString();
    }

/*    public static String checkOddEvenViaStream(String inputLine) {
        //assume inputLine is a number
        String[] chars = inputLine.split("");

        return Stream.of(chars).reduce("", (previousElement, element) -> {
            return previousElement.charAt(previousElement.length() - 1) previousElement + element;
        });

    }*/

    private static void buildString(StringBuilder stringBuilder, char[] charArray, int i) {
        if (ODD.contains(charArray[i]) && ODD.contains(charArray[i + 1])) {
            stringBuilder.append('*');
            stringBuilder.append(charArray[i + 1]);
        } else if (charArray[i] == ZERO || charArray[i + 1] == ZERO) {
            stringBuilder.append(charArray[i + 1]);
        } else if (ODD.contains(charArray[i]) || ODD.contains(charArray[i + 1])) {
            stringBuilder.append(charArray[i + 1]);
        } else {
            stringBuilder.append('-');
            stringBuilder.append(charArray[i + 1]);
        }
    }

    private static StringBuilder initializeStringBuilderWithFirstChar(char[] charArray) {
        return new StringBuilder().append(charArray[0]);
    }
}
