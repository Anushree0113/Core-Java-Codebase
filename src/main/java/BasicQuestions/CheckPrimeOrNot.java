package BasicQuestions;

import java.util.Scanner;

public class CheckPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        boolean result = checkPrimeOrNot(num);
        System.out.println("result = " + result);
    }

    public static boolean checkPrimeOrNot(int num) {
        if (num == 0 || num == 1) {
            System.out.println(num + " is not a prime number");
            return false;
        }

        int m = (int) Math.sqrt(num);

        for (int i = 2; i <= m; i++) {
            if (num % i == 0) {
                return false;
            }
        }

        return true;
    }
}
