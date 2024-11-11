package BasicQuestions;

import java.util.Scanner;

public class FactorialOfANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int factorial = getFactorial(number);
        System.out.println("factorial = " + factorial);
    }

    private static int getFactorial(int number) {
        int factorial = 1;
        for (int i = number; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }
}
