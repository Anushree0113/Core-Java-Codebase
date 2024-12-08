package leetcode.Array;

import java.util.*;

public class Pair3Sum {
    public static void main(String[] args) {

        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> pairSumList = threeSum(nums);
        for (List<Integer> pair : pairSumList) {
            System.out.println(pair);
        }
    }

    private static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();

        HashSet<Integer> set = new HashSet<>();

        int k;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                k = -(nums[i] + nums[j]);
                if (!set.contains(k)) {
                    set.add(nums[j]);
                } else {
                    set.add(k);
                    List<Integer> list = new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(k);
                    if (result.contains(list)) {
                        break;
                    }
                    result.add(list);
                }
            }

            set.clear();
        }

        return result;
    }
}
