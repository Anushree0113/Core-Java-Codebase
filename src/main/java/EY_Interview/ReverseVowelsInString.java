package EY_Interview;

public class ReverseVowelsInString {
    public static void main(String[] args) {
        String s = "IceCreAm";
        String reversedVowelString = getRevesedString(s);
        System.out.println("reversedVowelString = " + reversedVowelString);
    }

    public static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            return true;

        return false;
    }

    private static String getRevesedString(String s) {
        StringBuilder reversedString = new StringBuilder(s);
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char charAtI = s.charAt(i);
            if (isVowel(charAtI)) {
                for (int k = j; k > i; k--) {
                    if (isVowel(s.charAt(k))) {
                        char temp = charAtI;
                        reversedString.setCharAt(k, temp);
                        reversedString.setCharAt(i, s.charAt(k));
                        j = k - 1;
                        break;
                    }
                }
            }

            i++;

        }
        return reversedString.toString();
    }
}
