package EY_Interview;

public class RemovesDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        removeDuplicateElements(nums);
    }

    private static void removeDuplicateElements(int[] nums) {
        int k = 0;
        /* Removing duplicates from the sorted array with no extra space */
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[k]) {

            }

        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
