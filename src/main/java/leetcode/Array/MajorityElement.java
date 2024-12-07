package leetcode.Array;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        int element = majorityElement(nums);
        System.out.println("element = " + element);
    }

    private static int majorityElement(int[] nums) {
        int n = nums.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            if (map.get(key) > n / 2)
                return key;
        }
        return -1;
    }
}
