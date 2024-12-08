package EY_Interview;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        int[] commonElement = getCommonElement(nums1, nums2);
        for (int value : commonElement) {
            System.out.print(value + " ");
        }
    }

    private static int[] getCommonElement(int[] nums1, int[] nums2) {
        List<Integer> common = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!common.contains(nums1[i])) {
                        common.add(nums1[i]);
                    }
                }
            }
        }
        int[] result = new int[common.size()];
        for (int i = 0; i < common.size(); i++) {
            result[i] = common.get(i);
        }
        return result;
    }
}
