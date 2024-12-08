package EY_Interview;

import java.util.ArrayList;
import java.util.List;

public class MedianOfTwoSortedArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3,4};

        double median = findMedian(nums1, nums2);

        System.out.println("median = " + median);
    }

    private static double findMedian(int[] nums1, int[] nums2) {
        List<Integer> list = new ArrayList<Integer>();

        int i = 0;
        int j = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                if (!list.contains(nums1[i])) {
                    list.add(nums1[i]);
                    i++;
                }
            } else if (nums1[i] > nums2[j]) {
                if (!list.contains(nums2[j])) {
                    list.add(nums2[j]);
                    j++;
                }
            } else {
                if (!list.contains(nums1[i])) {
                    list.add(nums1[i]);
                    i++;
                }
            }
        }

        while (i < nums1.length) {
            if (!list.contains(nums1[i])) {
                list.add(nums1[i]);
                i++;
            }
        }
        while (j < nums2.length) {
            if (!list.contains(nums2[j])) {
                list.add(nums2[j]);
                j++;
            }
        }

        int totalLength = list.size();

        if(totalLength % 2 == 0){
            return (list.get(totalLength / 2 - 1) + list.get(totalLength / 2) ) / 2.0;
        }
        else
            return (list.get(totalLength / 2));
    }
}
