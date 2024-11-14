package leetcode.Array;

import java.util.Arrays;


public class MergeSortedArray {

    private static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = 0;
        int index = 0;

        int[] temp = new int[m + n];

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                temp[index++] = nums1[i++];
            } else {
                temp[index++] = nums2[j++];
            }
        }

        while (i < m) {
            temp[index++] = nums1[i++];
        }
        while (j < n) {
            temp[index++] = nums2[j++];
        }

        nums1 = Arrays.copyOf(temp, temp.length);

        for (int val : nums1) {
            System.out.print(val + " ");
        }

        System.out.println("The resulting array is : ");
        for (int val : temp) {
            System.out.print(val + " ");
        }
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }
}
