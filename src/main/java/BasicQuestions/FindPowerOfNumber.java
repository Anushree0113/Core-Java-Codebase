package BasicQuestions;

import java.util.Scanner;

public class FindPowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("Enter exponent value : ");
        int exp = sc.nextInt();
        int value = getPower(n, exp);
        System.out.println("value = " + value);
    }

    private static int getPower(int n, int exp) {
        int result = 1;
        while (exp != 0) {
            result = result * n;
            exp--;
        }

        return result;
    }
}
