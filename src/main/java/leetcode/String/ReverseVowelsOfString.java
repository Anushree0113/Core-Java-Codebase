package leetcode.String;

public class ReverseVowelsOfString {
    /**
     * @param s  -> Input character
     * @return -> returns true if character is a vowel.
     */
    // Helper method to check if a character is a vowel
    public static boolean isVowel(char s) {
        return s != 'a' && s != 'e' && s != 'i' && s != 'o' && s != 'u' &&
                s != 'A' && s != 'E' && s != 'I' && s != 'O' && s != 'U';
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        String reverseString = reverseVowels(s);
        System.out.println("reverseString = " + reverseString);  // Output should be "IceCrAEm"
    }

    private static String reverseVowels(String s) {
        // Convert string to a mutable StringBuilder
        StringBuilder sb = new StringBuilder(s);

        int left = 0, right = sb.length() - 1;

        // Use two pointers to swap vowels
        while (left < right) {
            // Move left pointer to the next vowel
            while (left < right && isVowel(sb.charAt(left))) {
                left++;
            }

            // Move right pointer to the previous vowel
            while (left < right && isVowel(sb.charAt(right))) {
                right--;
            }

            // Swap vowels
            if (left < right) {
                char temp = sb.charAt(left);
                sb.setCharAt(left, sb.charAt(right));
                sb.setCharAt(right, temp);
                left++;
                right--;
            }
        }

        return sb.toString();
    }
}
