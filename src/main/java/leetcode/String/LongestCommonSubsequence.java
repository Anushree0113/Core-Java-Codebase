package leetcode.String;

import java.util.Arrays;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        String text1 = "abcde";
        String text2 = "ace";
        int i = 0;
        int j = 0;
        int result = longestCommonSubsequence(text1, text2, i, j);
        System.out.println("result = " + result);
    }

    private static int longestCommonSubsequence(String text1, String text2, int i, int j) {

        int[][] memo = new int[text1.length()][text2.length()];

        for (int[] rows : memo) {
            Arrays.fill(rows, -1);
        }
        // Base case: If either string is exhausted, return 0
        if (i == text1.length() || j == text2.length()) {
            return 0;
        }

        // Check if the result for this subproblem has already been computed
        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        int ans = 0;

        if (text1.charAt(i) == text2.charAt(j)) {
            // If characters match, move to the next characters in both strings
            ans = 1 + longestCommonSubsequence(text1, text2, i + 1, j + 1);
        } else {
            // Otherwise, try moving one step ahead in either string
            ans = Math.max(longestCommonSubsequence(text1, text2, i + 1, j), longestCommonSubsequence(text1, text2, i, j + 1));
        }

        // Store the result in the memoization table
        memo[i][j] = ans;

        return ans;
    }
}
