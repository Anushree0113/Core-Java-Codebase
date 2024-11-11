package GneralQuestion;

public class FindFirstAndLastOccurrence {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 3, 5};
        int k = 3;
        int firstOccurrence = getFirstOccurrence(nums, k);
        System.out.println("firstOccurrence = " + firstOccurrence);
        int lastOccurrence = getLastOccurrence(nums, k);
        System.out.println("lastOccurrence = " + lastOccurrence);
    }


    private static int getFirstOccurrence(int[] nums, int value) {
        int start = 0;
        int end = nums.length - 1;
        int ans = 0;

        if (start > end) {
            return ans;
        }
        while (start <= end) {
            int m = start + (end - start) / 2;
            if (nums[m] == value) {
                ans = m;
                end = m - 1;
            }
            if (nums[m] > value) {
                end = m - 1;
            }
            if (nums[m] < value) {
                start = m + 1;
            }
        }
        return ans;
    }

    private static int getLastOccurrence(int[] nums, int value) {
        int s = 0;
        int e = nums.length - 1;
        int answer = 0;

        if (s > e) {
            return answer;
        }

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == value) {
                answer = m;
                s = m + 1;
            }
            if (nums[m] > value) {
                e = m - 1;
            }
            if (nums[m] < value) {
                s = m + 1;
            }

        }
        return answer;
    }
}
