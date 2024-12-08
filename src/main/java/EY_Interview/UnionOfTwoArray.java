package EY_Interview;

import java.util.ArrayList;
import java.util.List;

public class UnionOfTwoArray {
    public static void main(String[] args) {
        int[] nums1 = {2, 3, 4};
        int[] nums2 = {1, 5, 7};

        int[] union = findUnion(nums1, nums2);
        for (int i = 0; i < union.length; i++) {
            System.out.print(union[i] + " ");
        }

    }

    private static int[] findUnion(int[] a, int[] b) {
        List<Integer> unionList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < a.length && j < b.length) {
            if (a[i] == b[j]) {
                if (!unionList.contains(a[i])) {
                    unionList.add(a[i]);
                    i++;
                    j++;
                }
            } else if (a[i] < b[j]) {
                if (!unionList.contains(a[i])) {
                    unionList.add(a[i]);
                    i++;
                }
            } else {
                if (!unionList.contains(b[j])) {
                    unionList.add(b[j]);
                    j++;
                }
            }
        }

        while (i < a.length) {
            if (!unionList.contains(a[i])) {
                unionList.add(a[i]);
                i++;
            }
        }

        while (j < b.length) {
            if (!unionList.contains(b[j])) {
                unionList.add(b[j]);
                j++;
            }
        }

        int[] union = new int[unionList.size()];
        for (int k = 0; k < union.length; k++)
            union[k] = unionList.get(k);

        return union;
    }
}
