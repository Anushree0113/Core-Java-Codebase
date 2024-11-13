package BasicStringQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class FindVowelsInString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        ArrayList<Character> vowels = getUniqueVowelList(s);
        System.out.println("vowels = " + vowels);
    }

    private static ArrayList<Character> getUniqueVowelList(String s) {
        char[] chars = s.toCharArray();
        ArrayList<Character> vowels = new ArrayList<>();
        for (char ch : chars) {
            if (vowels.contains(ch)) {
                continue;
            } else {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels.add(ch);
                }
            }
        }
        return vowels;
    }
}
