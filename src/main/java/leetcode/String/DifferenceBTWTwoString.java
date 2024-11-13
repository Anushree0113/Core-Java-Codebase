package leetcode.String;

public class DifferenceBTWTwoString {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";

        char result = findTheDifference(s, t);

        System.out.println("result = " + result);
    }

    private static char findTheDifference(String s, String t) {
        char result = 0;

        for(int i = 0; i < s.length(); i++) {
            result ^= s.charAt(i);
        }

        for(int i = 0; i < t.length(); i++) {
            result ^= t.charAt(i);
        }

        return result;

    }
}
