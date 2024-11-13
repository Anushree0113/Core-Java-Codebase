package leetcode.String;

public class isSubsequenceString {
    public static void main(String[] args) {
        String s = "acb";
        String t = "ahbgdc";

        boolean result = isSubsequence(s, t);
        System.out.println("result = " + result);
    }

    private static boolean isSubsequence(String s, String t) {
        if (s.isEmpty())
            return true;

        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;

            if (i == s.length())
                return true;
        }

        return false;
    }
}
