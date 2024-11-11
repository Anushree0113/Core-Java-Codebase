package BasicQuestions;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String s = sc.nextLine();
        StringBuilder temp = new StringBuilder(s);

        int i = 0;
        int j = temp.length() - 1;

        while (i < j) {
            char ch = temp.charAt(i);
            temp.setCharAt(i, temp.charAt(j));
            temp.setCharAt(j, ch);
            i++;
            j--;
        }

        s = temp.toString();

        System.out.println(s);
    }
}
