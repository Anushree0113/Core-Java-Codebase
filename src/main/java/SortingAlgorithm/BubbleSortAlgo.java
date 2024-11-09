package SortingAlgorithm;

public class BubbleSortAlgo {
    public static void main(String[] args) {
        int[] nums = {7, 1, 6, 9, 2};
        sortTheArray(nums);
    }

    private static void sortTheArray(int[] nums) {
        boolean flag = false;

        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j < nums.length - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }

        for(int val : nums) {
            System.out.print(val + " ");
        }
    }
}
