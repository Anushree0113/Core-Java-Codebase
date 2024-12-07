package EY_Interview;

import java.util.Arrays;
import java.util.HashSet;

public class HasPairWithSum {
    public static void main(String[] args) {
        int[] nums = {10, 7, 0, 6, 2, 6};
        int target = 17;
        boolean result = findSum(nums, target);
        System.out.println("result = " + result);
    }

    private static boolean findSum(int[] nums, int target) {
        HashSet<Integer> set = new HashSet<>();
        return Arrays.stream(nums)
                .anyMatch(num -> {
                            if (set.contains(num))
                                return true;
                            set.add(target - num);
                            return false;
                        }
                );
    }
}
