package leetcode.String;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean result = isPalindrome(s);
        System.out.println("result = " + result);
    }

    private static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : chars) {
            if (isValidPalindrome(c)) {
                stringBuilder.append(c);
            }
        }

        String temp = stringBuilder.reverse().toString();
        int i = 0;
        int j = temp.length() - 1;
        while (i < j) {
            if (temp.charAt(i) != temp.charAt(j)) {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    private static boolean isValidPalindrome(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
    }
}
