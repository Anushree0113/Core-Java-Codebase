package GneralQuestion;

public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1};
        int maxVal = getPeakIndexValue(nums);
        System.out.println("maxVal = " + maxVal);
    }

    private static int getPeakIndexValue(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int mid = start + (end - start) / 2;

        while (start < end) {

            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
            mid = (start + end) / 2;

        }

        return nums[start] ;
    }
}
