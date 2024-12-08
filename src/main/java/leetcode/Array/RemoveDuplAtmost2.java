package leetcode.Array;

public class RemoveDuplAtmost2 {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int size = removeDuplicates(nums);
        System.out.println("size = " + size);
    }

    private static int removeDuplicates(int[] nums) {
        if (nums.length <= 2) {
            return nums.length;
        }

        int i = 2; // Start from the third element

        for (int j = 2; j < nums.length; j++) {
            // If the current element is not the same as the element two places before,
            // it means we can keep it
            if (nums[j] != nums[i - 2]) {
                nums[i] = nums[j];
                i++;
            }
        }

        return i;
    }
}
