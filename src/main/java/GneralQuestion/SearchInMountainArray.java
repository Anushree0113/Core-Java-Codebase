package GneralQuestion;

public class SearchInMountainArray {
    public static void main(String[] args) {
        int[] nums = {7, 9, 1, 2, 3};
        int k = 2;

        int index = searchTheElement(nums, k);
        System.out.println("index = " + index);
    }

    private static int searchTheElement(int[] nums, int k) {
        int start = 0;
        int end = nums.length - 1;
        int mid = (start + end) / 2;
        while (start <= end) {

            if (nums[mid] == k) {
                return mid;
            }
            if (nums[start] < nums[mid]) {

                if (nums[start] <= k && k < nums[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (k > nums[mid] && k <= nums[end]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }

            }

            mid = (start + end) / 2;
        }
        return -1;
    }
}
