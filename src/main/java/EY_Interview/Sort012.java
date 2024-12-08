package EY_Interview;

public class Sort012 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 0, 1, 2};
        sortArray(nums);
    }

    private static void sortArray(int[] nums) {
        //Using Dutch national's flag algorithms

        int low = 0;
        int mid = 0;
        int high = nums.length - 1;

        while (mid <= high) {
            if (nums[mid] == 0) {
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                int temp = nums[high];
                nums[high] = nums[mid];
                nums[mid] = temp;

                high--;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
