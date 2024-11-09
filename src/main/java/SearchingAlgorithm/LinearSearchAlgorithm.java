package SearchingAlgorithm;

public class LinearSearchAlgorithm {
    public static void main(String[] args) {
        int[] nums = {7, 1, 6, 9, 2};
        int element = 9;
        boolean result = searchElement(nums, element);
        System.out.println("result = " + result);
    }

    private static boolean searchElement(int[] nums, int element) {
        for (int val : nums) {
            if (val == element)
                return true;
        }

        return false;
    }
}
