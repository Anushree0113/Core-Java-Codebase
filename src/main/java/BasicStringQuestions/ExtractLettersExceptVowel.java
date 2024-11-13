package BasicStringQuestions;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static BasicStringQuestions.CountVowelsInString.isVowel;

public class ExtractLettersExceptVowel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        List<Character> characterList = getLettersExceptVowel(s);
        System.out.println("characterList = " + characterList);
    }

    private static List<Character> getLettersExceptVowel(String s) {
        List<Character> characterList = new ArrayList<Character>();
        char[] chars = s.toCharArray();
        for (char c : chars) {
            if (!isVowel(c)) {
                characterList.add(c);
            }
        }
        return characterList;
    }
}
