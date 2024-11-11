package leetcode.String;

public class UniqueCharacterInString {
    public static void main(String[] args) {
        String s = "leetcode";
        int result = firstUniqChar(s);
        System.out.println("result = " + result);
    }

    private static int firstUniqChar(String s) {
        int[] count = new int[26];
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;
        }

        for (int i = 0; i < s.length(); i++) {
            int value = count[s.charAt(i) - 'a'];
            if (value == 1) return i;
        }
        return -1;
    }
}
