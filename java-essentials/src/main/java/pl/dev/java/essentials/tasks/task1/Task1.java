package pl.dev.java.essentials.tasks.task1;

public class Task1 {
    private static final String SHIFTED = "shifted";
    private static final String NOT_SHIFTED = "not shifted";
    private static final String SPLITTING_REGEX = ",";


    //very inefficient way
    public static String isShifted(String words) {

        String[] splitWords = words.split(SPLITTING_REGEX);
        if (validateLength(splitWords)) {
            char[] firstWord = splitWords[0].toCharArray();
            char[] secondWord = splitWords[1].toCharArray();
            for (int shiftedIndex = 0; shiftedIndex < firstWord.length; shiftedIndex++) {
                if (isShifted(firstWord, secondWord, shiftedIndex)) {
                    return SHIFTED;
                }
            }

        }
        return NOT_SHIFTED;
    }

    private static boolean isShifted(char[] firstWord, char[] secondWord, int shiftedIndex) {
        for (int i = 0; i < firstWord.length; i++) {
            if (secondWord[(i + shiftedIndex) % firstWord.length] != firstWord[i]) {
                return false;
            }
        }
        return true;
    }

    private static boolean validateLength(String[] splitWords) {
        return splitWords.length == 2 && splitWords[0].length() == splitWords[1].length();
    }


    public static String isShiftedClever(String words) {
        String[] splitWords = words.split(SPLITTING_REGEX);
        if (validateLength(splitWords) && (splitWords[0] + splitWords[0]).contains(splitWords[1])) {
            return SHIFTED;
        }
        return NOT_SHIFTED;
    }

}
