package pl.dev.java.essentials.hackerrank.days30challenge.day18;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Solution {

    private Stack<Character> stack = new Stack<>();
    private LinkedList<Character> queue = new LinkedList<>();


    private char popCharacter() {
        return stack.pop();
    }

    private char dequeueCharacter() {
        Character character = queue.getFirst();
        queue.removeFirst();
        return character;
    }

    private void enqueueCharacter(char c) {
        queue.add(c);
    }

    private void pushCharacter(char c) {
        stack.push(c);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();


        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Solution p = new Solution();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length / 2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println("The word, " + input + ", is "
                + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
    }
}