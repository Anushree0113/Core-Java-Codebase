package SortingAlgorithm;

public class MergeSort {
    public static void main(String[] args) {
        int[] nums = {2, 5, 1, 6, 9};
        int n = nums.length;

        int s = 0;
        int e = n - 1;

        mergeSortTheArray(nums, s, e);

        for (int val : nums) {
            System.out.print(val + " ");
        }

    }

    private static void mergeSortTheArray(int[] nums, int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2;
        mergeSortTheArray(nums, s, mid);
        mergeSortTheArray(nums, mid + 1, e);
        mergeTheArray(nums, s, mid, e);
    }

    private static void mergeTheArray(int[] nums, int s, int mid, int e) {
        int length1 = mid - s + 1;
        int length2 = e - mid;

        int[] temp1 = new int[length1];
        int[] temp2 = new int[length2];

        int k = s;

        for (int i = 0; i < length1; i++) {
            temp1[i] = nums[k++];

        }

        k = mid + 1;

        for (int j = 0; j < length2; j++) {
            temp2[j] = nums[k++];
        }

        int pointer1 = 0;
        int pointer2 = 0;

        k = s;

        while (pointer1 < length1 && pointer2 < length2) {
            if (temp1[pointer1] < temp2[pointer2]) {
                nums[k++] = temp1[pointer1++];
            } else
                nums[k++] = temp2[pointer2++];
        }

        while (pointer1 < length1) {
            nums[k++] = temp1[pointer1++];
        }
        while (pointer2 < length2) {
            nums[k++] = temp2[pointer2++];
        }


    }
}
