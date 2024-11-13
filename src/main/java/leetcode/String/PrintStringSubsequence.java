package leetcode.String;

import java.util.ArrayList;

public class PrintStringSubsequence {
    public static void main(String[] args) {
        String str = "abc";
        ArrayList<String> subsequenceList = subsequences(str);
        System.out.println("subsequenceList = " + subsequenceList);
    }

    private static ArrayList<String> subsequences(String str) {
        StringBuilder sb = new StringBuilder();
        ArrayList<String> subsequenceList = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    sb.append(str.charAt(i));
                    subsequenceList.add(sb.toString());
                    sb.setLength(0);
                } else {
                    sb.append(str.charAt(i));
                    sb.append(str.charAt(j));
                    subsequenceList.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            }
        }

        return subsequenceList;
    }
}
