package leetcode.String;

public class ReverseStringII {
    public static String reverseStr(String s, int k) {
        int i = 0;
        int j = k - 1;

        StringBuilder sb = new StringBuilder(s);

        while (i < j) {
            char temp1 = sb.charAt(i);
            char temp2 = sb.charAt(j);
            sb.setCharAt(i, temp2);
            sb.setCharAt(j, temp1);

            i++;
            j--;
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        String result = reverseStr(s, k);
        System.out.println("result = " + result);
    }
}
