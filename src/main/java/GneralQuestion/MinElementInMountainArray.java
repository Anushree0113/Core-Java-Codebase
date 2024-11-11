package GneralQuestion;

public class MinElementInMountainArray {
    public static void main(String[] args) {
        int[] nums = {7, 9, 1, 2, 3};
        int min = getMinElement(nums);
        System.out.println("min = " + min);
    }

    private static int getMinElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;

        while (start < end) {
            if (nums[mid - 1] < nums[mid]) {
                start = mid + 1;
            } else {
                end = mid;
            }

            mid = start + (end - start) / 2;
        }
        return nums[mid];
    }
}
