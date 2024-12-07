package EY_Interview;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        boolean isValidPalindrome = checkPalindromeIsValid(s);
        System.out.println("isValidPalindrome = " + isValidPalindrome);
    }

    public static boolean isValidChar(char c) {
        return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9';
    }

    private static boolean checkPalindromeIsValid(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (isValidChar(ch)) {
                sb.append(ch);
            }
        }

        s = sb.toString();

        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
               return false ;
            }
            i++ ;
            j-- ;
        }

        return true ;

    }
}
