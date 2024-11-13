package leetcode.Array;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 2, 3, 4};

        int[] result = getNextGreaterElement(nums1, nums2);

        for (int val : result)
            System.out.print(val + " ");
    }

    private static int[] getNextGreaterElement(int[] nums1, int[] nums2) {

        int index;
        int count;

        int[] resultArray = new int[nums1.length];

        int j;

        for (int i = 0; i < nums1.length; i++) {
            index = 0;
            j = 0;
            count = 0;
            int v1 = nums1[i];
            for (; j < nums2.length; j++) {
                int v2 = nums2[j];
                if (v1 == v2) {
                    index = j;
                    break;
                }

            }

            while (index < nums2.length - 1 && count < 1) {
                index++;
                if (nums2[index] > nums2[j]) {
                    resultArray[i] = nums2[index];
                    count++;
                    break;
                }
            }
            if (index == nums2.length - 1) {
                resultArray[i] = -1;
            }
        }


        return resultArray;
    }
}
