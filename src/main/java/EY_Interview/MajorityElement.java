package EY_Interview;

import java.util.*;

public class MajorityElement {
    public static void main(String[] args) {
        int[] num = {3, 2, 3};
        List<Integer> element = findMajorityElement(num);
        System.out.println("element = " + element);

    }

    private static List<Integer> findMajorityElement(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        Iterator<Integer> iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int key = iterator.next();
            if (map.get(key) > nums.length / 3) {
                if (!list.contains(key)) {
                    list.add(key);
                }
            }
        }
        return list;
    }
}
