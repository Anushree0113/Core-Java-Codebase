package EY_Interview;

import java.util.Arrays;

public class Count_Occurrence {
    public static void main(String[] args) {
        int[] nums = {2, 2, 3, 3, 3, 3, 4};
        int findElement = 3;

        long occurrence = findOccurrence(nums, findElement);
        System.out.println("occurrence = " + occurrence);
    }

    private static long findOccurrence(int[] nums, int findElement) {
        long occurrence = Arrays.stream(nums).filter(x -> x == findElement).count();
        return occurrence;
    }
}
