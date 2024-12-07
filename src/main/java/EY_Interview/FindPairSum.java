package EY_Interview;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindPairSum {
    public static void main(String[] args) {
        int[] nums = {0, -1, 2, -3, 1};
        int target = -2;
        List<List<Integer>> pairs = getPairSum(nums, target);
        System.out.println("pairs = " + pairs);

    }

    private static List<List<Integer>> getPairSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> pairs = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int requiredNum = target - num;
            if (!map.containsKey(requiredNum)) {
                map.put(num, i);
            } else {
                pairs.add(nums[i]);
                pairs.add(requiredNum);
                res.add(pairs);
            }
        }
        return res;
    }
}
