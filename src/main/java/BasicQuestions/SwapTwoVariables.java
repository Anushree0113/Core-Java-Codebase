package BasicQuestions;

import java.util.Scanner;

public class SwapTwoVariables {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        swapTheNumber(a, b);
    }

    private static void swapTheNumber(int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("The first number is: " + a);
        System.out.println("The second number is: " + b);
    }
}
