package leetcode.Array;

import java.util.ArrayList;
import java.util.List;

public class MinimumSizeSubArray {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1,1,1,1};
        int target = 11;
        int len = minSubArrayLen(target, nums);
        System.out.println("len = " + len);
    }

    private static int minSubArrayLen(int target, int[] nums) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) {
                list.add(i);
                break;
            } else if (nums[i] < target) {
                for (int j = i; j < nums.length; j++) {
                    if (sum + nums[j] < target) {
                        sum += nums[j];
                    } else if (sum + nums[j] == target) {
                        list.add(j - i + 1);
                        sum = 0 ;
                        break;
                    } else {
                        sum = 0;
                        break;
                    }
                    if(list.isEmpty() && sum < target && j == nums.length - 1){
                        return 0 ;
                    }
                }
            }


        }

        int min = Integer.MAX_VALUE;
        if(list.isEmpty()){
            return 0;
        }
        for (int val : list) {
            min = Math.min(min, val);
        }

        return min;
    }
}
