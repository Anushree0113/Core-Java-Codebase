package leetcode.String;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacter {
    public static void main(String[] args) {
        String s = "au";
        int length = getLongestSubstring(s);
        System.out.println("length = " + length);
    }

    private static int getLongestSubstring(String s) {

        Map<Character, Integer> map = new HashMap<>();
        int length = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = i; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (map.containsKey(ch)) {
                    length = Math.max(length, j - i);
                    map.clear();
                    break;
                } else {
                    map.put(ch, map.getOrDefault(c, 0) + 1);
                }

                length = Math.max(length, map.size());
            }
        }

        if (length == 0) {
            return map.size();
        }

        return length;
    }
}
