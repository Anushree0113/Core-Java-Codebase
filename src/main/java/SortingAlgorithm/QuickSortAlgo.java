package SortingAlgorithm;

public class QuickSortAlgo {
    public static void main(String[] args) {
        int[] nums = {24, 9, 29, 14, 19, 27};
        int n = nums.length;
        int s = 0;
        int e = n - 1;
        quickSort(nums, s, e);

        for (int val : nums) {
            System.out.print(val + " ");
        }
    }

    private static void quickSort(int[] nums, int s, int e) {
        if (s >= e) {
            return;
        }

        int partition = getPivotIndex(nums, s, e);

        quickSort(nums, s, partition - 1);
        quickSort(nums, partition + 1, e);

    }

    private static int getPivotIndex(int[] nums, int s, int e) {
        int pivot = nums[0];
        int count = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= pivot) {
                count++;
            }
        }

        int pivotIndex = s + count;


        int temp = nums[s];
        nums[s] = nums[pivotIndex];
        nums[pivotIndex] = temp;

        int i = 0;
        int j = nums.length - 1;

        while (i < pivotIndex && j > pivotIndex) {
            while (nums[i] < pivot) {
                i++;
            }
            while (nums[j] > pivot) {
                j--;
            }

            while (i < pivotIndex && j > pivotIndex) {
                int tempVal = nums[i];
                nums[i] = nums[j];
                nums[j] = tempVal;

                i++;
                j--;
            }
        }

        return pivotIndex;

    }
}
