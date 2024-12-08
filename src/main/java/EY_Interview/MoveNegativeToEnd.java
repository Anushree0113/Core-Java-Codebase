package EY_Interview;

public class MoveNegativeToEnd {
    public static void main(String[] args) {
        int[] nums = {-5, 7, -3, -4, 9, 10, -1, 11};
        moveNegativeNumToEnd(nums);
    }

    private static void moveNegativeNumToEnd(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
            } else if (nums[i] < 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] > 0) {
                        int temp = nums[j];
                        nums[j] = nums[i];
                        nums[i] = temp;
                        break;
                    }
                }
            }
        }


        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
