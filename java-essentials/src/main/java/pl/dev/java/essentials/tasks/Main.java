package pl.dev.java.essentials.tasks;

import pl.dev.java.essentials.tasks.task7.Task7;
import pl.michal.tasks.task1.Task1;
import pl.michal.tasks.task7.Task7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Task7
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String sentence = in.nextLine();
                Task7.findPairsThatSumUpToValue(sentence);
            }
        }

/*

        //Task6
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String sentence = in.nextLine();
                System.out.println(Task6.findDuplicateBoolean(sentence));
                System.out.println(Task6.findDuplicateHashSet(sentence));

            }
        }
*/



/*
//Task 5

        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String sentence = in.nextLine();
                System.out.println(Task5.reverseWordsInSentence(sentence));

            }
        }*/

        //Task4
/*
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String sentence = in.nextLine();
                System.out.println(Task4.findFirstLongestWord(sentence));

            }
        }*/
        //TASK3

/*
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                String number = in.nextLine();
                System.out.println(Task3.checkOddEvenViaStream(number));

            }
        }*/


        //TASK2
        /*
        try (Scanner in = new Scanner(System.in)) {
            while (in.hasNext()) {
                int number = in.nextInt();
                System.out.println(Task2.generateSum(number));

            }
        }
*/
        //Task1

        String names;
        try (Scanner in = new Scanner(System.in)) {
            names = in.nextLine();
        }
        System.out.println(Task1.isShiftedClever(names));


    }
}
