package BasicStringQuestions;

import java.util.ArrayList;

class Pair {
    char alphabet;
    int count;

    Pair(char ch, int x) {
        this.alphabet = ch;
        this.count = x;
    }

    public static void main(String[] args) {
        String str = "APPLE";
        int n = str.length();
        ArrayList<Pair> map = DuplicateCharString.duplicate_char(str, n);
        for (Pair pair : map) {
            System.out.print(pair.alphabet + " " + pair.count + " ");

        }

    }


    public static class DuplicateCharString {

        private static ArrayList<Pair> duplicate_char(String str, int n) {
            int[] frequencyArray = new int[26];
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                    frequencyArray[str.charAt(i) - 'a']++;
                } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                    frequencyArray[str.charAt(i) - 'A']++;
                }

            }
            ArrayList<Pair> pairs = new ArrayList<>();
            for (int i : frequencyArray) {
                if (i > 1) {
                    pairs.add(new Pair(str.charAt(i), i));
                }
            }

            return pairs;

        }
    }

}
