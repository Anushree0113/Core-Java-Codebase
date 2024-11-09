package SearchingAlgorithm;

public class BinarySearchAlgorithm {
    public static void main(String[] args) {
        int[] nums = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int k = 23;
        boolean result = searchTheValue(nums, k);
        System.out.println("result = " + result);
    }

    private static boolean searchTheValue(int[] nums, int k) {
        int s = 0;
        int e = nums.length - 1;

        int mid = s + (e - s) / 2;

        while (s <= e) {
            if (nums[mid] == k) {
                return true;
            }

            if (nums[mid] > k) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }

            mid = s + (e - s) / 2;
        }

        return false;
    }
}
