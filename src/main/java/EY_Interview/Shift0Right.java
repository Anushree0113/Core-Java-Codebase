package EY_Interview;

public class Shift0Right {
    public static void main(String[] args) {
        int[] nums = {1, 2, 0, 4, 3, 0, 5, 0};
        shift0Right(nums);
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
    }

    private static void shift0Right(int[] nums) {

        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0)
                index++;
            else
                for (int j = index + 1; j < nums.length; j++) {
                    if (nums[j] != 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        index++;
                        break;
                    }
                }

        }

    }
}
