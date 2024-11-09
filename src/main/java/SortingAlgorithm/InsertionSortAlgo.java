package SortingAlgorithm;

public class InsertionSortAlgo {
    public static void main(String[] args) {
        int[] nums = {6, 5, 4, 3, 2, 1};
        sortUsingInsertionSortAlgo(nums);
    }

    private static void sortUsingInsertionSortAlgo(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int temp = nums[i];
            int j = i - 1;
            for (; j >= 0; j--) { // This one is to  compared with previous one
                if (temp < nums[j]) {
                    nums[j + 1] = nums[j];
                } else {
                    break;
                }
            }

            nums[j + 1] = temp;
        }

        for (int val : nums) {
            System.out.print(val + " ");
        }
    }
}
