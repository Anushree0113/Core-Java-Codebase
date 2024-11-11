package leetcode.String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MostCommonWord {
    public static void main(String[] args) {
        String paragraph = "Bob. hIt, baLl";
        String[] banned = {"bob", "hit"};
        String commonWord = getMostCommonWord(paragraph, banned);
        System.out.println("commonWord = " + commonWord);
    }

    private static String getMostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase();
        String[] paragraphArray = paragraph.split("[^a-zA-Z]+");
        List<String> list = Arrays.stream(banned).toList();
        Map<String, Integer> countMap = new HashMap<>();
        for (String word : paragraphArray) {
            if (!list.contains(word)) {
                countMap.put(word, countMap.getOrDefault(word, 0) + 1);
            }
        }

        int maxFrequency = 0;
        String mostCommonWord = "";
        for (String val : countMap.keySet()) {
            int value = countMap.get(val);
            if (value > maxFrequency) {
                maxFrequency = value;
                mostCommonWord = val;
            }
        }


        return mostCommonWord;
    }
}
