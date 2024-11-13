package leetcode.Array;

public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int value = searchInsert(nums, target);
        System.out.println("value = " + value);
    }

    private static int searchInsert(int[] nums, int target) {
        int i = 0;
        int j = nums.length - 1;

        while (i <= j) {
            int mid = i + (j - i) / 2;

            if (nums[mid] == target) {
                return mid; // Target found
            } else if (nums[mid] < target) {
                i = mid + 1; // Narrow search to the right half
            } else {
                j = mid - 1; // Narrow search to the left half
            }
        }

        // If the target is not found, return the index where it would be inserted.
        return i;
    }

}
