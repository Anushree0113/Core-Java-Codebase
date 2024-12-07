package leetcode.Array;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 2;
        int outcome = removeElement(nums, val);
        System.out.println("outcome = " + outcome);
    }

    private static int removeElement(int[] nums, int val) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != val) {
                int temp = nums[i];
                nums[i] = nums[index];
                nums[index] = temp;
                index++;
            }


        }

        return index;
    }
}
