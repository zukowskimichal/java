package pl.dev.java.essentials.hackerrank.days30challenge.day12;

import java.util.Arrays;

public class Student extends Person {
    private int[] testScores;

    public Student(String firstName,
                   String lastName,
                   int idNumber,
                   int[] scores) {
        super(firstName, lastName, idNumber);
        this.testScores = scores;
    }


    /*
     *   Class Constructor
     *
     *   @param firstName - A string denoting the Person's first name.
     *   @param lastName - A string denoting the Person's last name.
     *   @param id - An integer denoting the Person's ID number.
     *   @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here

    /*
     *   Method Name: calculate
     *   @return A character denoting the grade.
     */
    // Writ


    public char calculate() {
        int mean = Arrays.stream(testScores).reduce(0, Integer::sum) / testScores.length;
        char meanCharacterValue;
        if (mean >= 90) {
            meanCharacterValue = 'O';
        } else if (mean >= 80) {
            meanCharacterValue = 'E';
        } else if (mean >= 70) {
            meanCharacterValue = 'A';
        } else if (mean >= 55) {
            meanCharacterValue = 'P';
        } else if (mean >= 40) {
            meanCharacterValue = 'D';
        } else {
            meanCharacterValue = 'T';
        }
        return meanCharacterValue;
    }
}
