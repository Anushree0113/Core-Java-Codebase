package EY_Interview;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        int[] nums = {12, 35, 1, 10, 34, 1};
        int secondLargest = getSecondLargest(nums);
        System.out.println("secondLargest = " + secondLargest);
    }

    private static int getSecondLargest(int[] nums) {
        int secondLargest = -1;
        int largest = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) {
                largest = nums[i];
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > secondLargest && nums[i] != largest) {
                secondLargest = nums[i];
            }
        }
        return secondLargest;
    }
}
