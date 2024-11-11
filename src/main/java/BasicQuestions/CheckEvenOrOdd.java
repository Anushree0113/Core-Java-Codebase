package BasicQuestions;

import java.util.Scanner;

public class CheckEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int number = sc.nextInt();
        String result = checkEvenOrOdd(number);
        System.out.println("The number is " + result);
    }

    private static String checkEvenOrOdd(int number) {
        if (number % 2 == 0) {
            return "Even";
        }
        return "Odd";
    }
}
