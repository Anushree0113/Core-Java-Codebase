package EY_Interview;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2,-4,-6};
        int sum = getMaxSum(arr);
        System.out.println("Maximum sum possible: " + sum);
    }

    private static int getMaxSum(int[] arr) {
        int sum = 0;
        int max = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0)
                sum = 0;
        }

        return max;
    }
}
