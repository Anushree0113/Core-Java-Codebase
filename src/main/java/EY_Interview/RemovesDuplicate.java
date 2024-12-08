package EY_Interview;

public class RemovesDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int indexVal = removeDuplicateElements(nums);
        for (int i = 0; i < indexVal; i++) {
            System.out.print(nums[i] + " ");
        }

    }

    private static int removeDuplicateElements(int[] nums) {
        /* Removing duplicates from the sorted array with no extra space */
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[index + 1] = nums[i];
                index++;
            }
        }
        return index + 1;
    }
}
