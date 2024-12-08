package EY_Interview;

import java.util.*;

public class FindRepeatingChar {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        List<Character> repeatedChar = getRepeatedChar(str);
        System.out.println("repeatedChars = " + repeatedChar);
    }

    private static List<Character> getRepeatedChar(String str) {
        Map<Character, Integer> map = new HashMap<>();
        List<Character> repeatedChar = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }
        Iterator<Character> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            Character character = iterator.next();
            if (map.get(character) > 1) {
                repeatedChar.add(character);
            }
        }
        return repeatedChar;
    }
}
