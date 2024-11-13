package BasicStringQuestions;

import java.util.Scanner;

public class FrequencyOfCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        System.out.print("Frequency of character: ");
        char character = sc.next().charAt(0);
        int frequency = getFrequency(s, character);
        System.out.println("frequency = " + frequency);
    }

    private static int getFrequency(String s, char character) {
        char[] chars = s.toCharArray();
        int frequency = 0;
        for (char aChar : chars) {
            if (aChar == character) {
                frequency++;
            }
        }
        return frequency;
    }
}
