package leetcode.String;

import java.util.Arrays;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String result = longestCommonPrefix(strs);
        System.out.println("result = " + result);
    }

    private static String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String firstString = strs[0];
        String lastString = strs[strs.length - 1];

        int i = 0;
        int j = 0;

        StringBuilder sb = new StringBuilder();

        while (i < firstString.length() && j < lastString.length()) {

            if (firstString.charAt(i) == lastString.charAt(j)) {
                sb.append(firstString.charAt(i));
                i++;
                j++;
            } else {
                break;
            }
        }

        return sb.toString();
    }
}
