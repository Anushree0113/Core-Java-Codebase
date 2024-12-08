package leetcode.Array;

public class RemoveDuplicateEle {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        int result = removeDuplicate(nums);
        System.out.println("result = " + result);

    }

    private static int removeDuplicate(int[] nums) {

     /*   HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int i = 0;
        List<Integer> collect = set.stream().toList();
        nums = new int[collect.size()];
        for (Integer num : collect) {
            nums[i++] = num;
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }
        return set.size();*/
        int k = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k] && k != nums.length - 1) {
                nums[k + 1] = nums[i];
                k++;
            }
        }

        return k + 1;
    }
}
