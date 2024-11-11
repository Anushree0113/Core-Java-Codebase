package BasicQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class CheckArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        boolean result = checkIsArmstrong(n);
        System.out.println("result = " + result);
    }

    private static boolean checkIsArmstrong(int n) {
        ArrayList<Integer> list = new ArrayList<>();
        int temp = n;
        while (temp != 0) {
            int digit = temp % 10;
            list.add(digit);
            temp /= 10;
        }

        double sum = 0;

        int numSize = list.size();

        for (int val : list) {
            sum = sum + Math.pow(val, numSize);
        }

        int r = (int) sum;

        return r == n;
    }
}
