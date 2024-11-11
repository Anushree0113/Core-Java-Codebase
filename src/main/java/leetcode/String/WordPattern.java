package leetcode.String;

import java.util.*;

public class WordPattern {
    public static void main(String[] args) {
        String pattern = "aba";
        String s = "dog cat cat";
        boolean result = wordPattern(pattern, s);
        System.out.println("result = " + result);

    }

    private static boolean wordPattern(String pattern, String s) {
        String[] words = s.split(" ");
        /*      Map<Character, String> map = new HashMap<>();*/
        /*for (int i = 0; i < pattern.length(); i++) {
            char ch = pattern.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, words[i]);
            }

        }*/

        LinkedHashMap<String, Integer> frequencyMap = new LinkedHashMap<>();
        for (String word : words) {
            frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
        }

        LinkedHashMap<Character, Integer> charFrequencyMap = new LinkedHashMap<>();
        for (char c : pattern.toCharArray()) {
            charFrequencyMap.put(c, charFrequencyMap.getOrDefault(c, 0) + 1);
        }

        return compareValues(frequencyMap, charFrequencyMap);
    }

    private static boolean compareValues(Map<String, Integer> map1, Map<Character, Integer> map2) {

        List<Integer> lis1 = new ArrayList<>(map1.values());
        List<Integer> lis2 = new ArrayList<>(map2.values());

        int i = 0;
        int j = 0;

        while (i < lis1.size() && j < lis2.size()) {
            if (!Objects.equals(lis1.get(i), lis2.get(j))) {
                return false;
            }
            i++;
            j++;
        }

        return i == lis1.size() && j == lis2.size();
    }
}

