package BasicQuestions;

import java.util.ArrayList;
import java.util.Scanner;

public class FindEvenNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start range : ");
        int start = scanner.nextInt();
        System.out.print("Enter the end range : ");
        int end = scanner.nextInt();
        ArrayList<Integer> evenList = getEvenNumbers(start, end);
        System.out.println("Even numbers  = " + evenList);
    }

    private static ArrayList<Integer> getEvenNumbers(int start, int end) {
        ArrayList<Integer> resultList = new ArrayList<>();
        while (start <= end) {
            if (start % 2 == 0) {
                resultList.add(start);
            }
            start++;
        }
        return resultList;
    }
}
