package leetcode.String;

import java.util.Arrays;

public class LongestPalindromicSubsequence {
    private static int[][] memo;

    private static int solve(String s1, String s2, int i, int j) {
        memo = new int[s1.length()][s2.length()];
        for (int[] rows : memo) {
            Arrays.fill(rows, -1);
        }

        if (memo[i][j] != -1)
            return memo[i][j];

        int ans = 0;

        if (s1.charAt(i) == s2.charAt(j)) {
            // If characters match, move to the next characters in both strings
            ans = 1 + solve(s1, s2, i + 1, j + 1);
        } else {
            // Otherwise, try moving one step ahead in either string
            ans = Math.max(solve(s1, s2, i + 1, j), solve(s1, s2, i, j + 1));
        }
        memo[i][j] = ans;

        return ans;
    }

    private static int longestPalindrome(String s) {
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String reverseString = sb.toString();
        return solve(s, reverseString, 0, 0);
    }

    public static void main(String[] args) {
        String s1 = "babad";
        int result = longestPalindrome(s1);
        System.out.println("result = " + result);
    }
}
