package BasicQuestions;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConvertNumberToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result = convertNumberToString(num);
        System.out.println("result = " + result);
    }

    private static String convertNumberToString(int num) {

        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");

        if (num == 0) {
            map.put(0, "Zero");
        }

        String number = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        for (char c : number.toCharArray()) {
            result.append(map.get(Character.getNumericValue(c))).append(" ");
        }

        return result.toString();

    }
}
