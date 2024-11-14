package leetcode.Array;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        boolean result = containsDuplicate(nums);
        System.out.println("result = " + result);
    }

    private static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> seen = new HashSet<>();

        for (int val : nums) {
            if (seen.contains(val)) {
                return true;
            }
            seen.add(val);
        }

        return false;
    }
}
