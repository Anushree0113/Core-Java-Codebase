package leetcode.String;

import java.util.Scanner;

public class LengthOfLastWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String s = sc.nextLine();
        System.out.println("Length of Input = " + s.length());
        int length = lengthOfLastWord(s);
        System.out.println("length = " + length);
    }

    private static int lengthOfLastWord(String s) {
        String[] list = s.split(" ");
        return list[list.length - 1].length();
    }
}
