package BasicStringQuestions;

import java.util.Scanner;

public class MaxOccurringChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        //assuming at least one character will appear 2 times  or input is empty
        char result = getMaxOccurringCharacter(s);
        if (result == ' ') {
            System.out.println("Invalid input !");
        } else {
            System.out.println("Maximum Occurring Character = " + result);
        }

    }

    private static char getMaxOccurringCharacter(String s) {
        int[] frequency = new int[26];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int value = c - 'a';
            frequency[value]++;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > max) {
                max = i;
            }
        }
        return max == 0 ? ' ' : (char) (max + 'a');
    }
}
