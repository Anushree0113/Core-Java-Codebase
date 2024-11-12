package leetcode.String;

public class RotateString {

    private static boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        String doubleS = s + s;
        System.out.println("doubleS = " + doubleS);

        return doubleS.contains(goal);
    }

    public static void main(String[] args) {
        String s = "gcmbf";
        String goal = "fgcmb";
        boolean result = rotateString(s, goal);
        System.out.println("result = " + result);
    }
}
