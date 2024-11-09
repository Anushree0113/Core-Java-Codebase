package SortingAlgorithm;

public class SelectionSortAlgo {
    public static void main(String[] args) {
        int[] nums = {6, 2, 8, 4, 10};
        sortTheArrayUsingSortingAlgo(nums);
    }

    private static void sortTheArrayUsingSortingAlgo(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }


        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
