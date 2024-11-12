package leetcode.String;

import java.util.*;

public class MinIndexSumOfTwoLists {
    public static void main(String[] args) {
        String[] list1 = {"happy", "sad", "good"};
        String[] list2 = {"sad", "happy", "good"};

        String[] result = findRestaurant(list1, list2);
        for (String s : result) {
            System.out.print(s + " ");
        }
    }

    private static String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> wordSumMap = new HashMap<>();
        for (int i = 0; i < list1.length; i++) {
            String word1 = list1[i];
            for (int j = 0; j < list2.length; j++) {
                String word2 = list2[j];
                if (word1.equals(word2)) {
                    wordSumMap.put(word1, wordSumMap.getOrDefault(word1, i + j));
                }
            }
        }

        List<String> resultList = getMinIndexElement(wordSumMap);
        return resultList.toArray(new String[0]);
    }

    private static List<String> getMinIndexElement(Map<String, Integer> wordSumMap) {
        int min = Integer.MAX_VALUE;
        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordSumMap.entrySet()) {
            String word = entry.getKey();
            int sum = entry.getValue();
            if (sum < min) {
                min = sum;
                resultList.clear();
                resultList.add(word);
            }

        }

        for(Map.Entry<String, Integer> entry : wordSumMap.entrySet()) {
            String word = entry.getKey();
            if(entry.getValue().equals(min) && !resultList.contains(word)) {
                resultList.add(word);
            }
        }
        return resultList;
    }
}
