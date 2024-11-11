package BasicQuestions;

import java.util.ArrayList;
import java.util.Scanner;

import static BasicQuestions.CheckPrimeOrNot.checkPrimeOrNot;

public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the start range : ");
        int start = sc.nextInt();
        System.out.print("Enter the end range : ");
        int end = sc.nextInt();

        ArrayList<Integer> resultList = new ArrayList<>();
        ;
        for (int i = start; i <= end; i++) {
            if (checkPrimeOrNot(i)) {
                resultList.add(i);
            }

        }

        System.out.println("primeList = " + resultList);
    }

}
