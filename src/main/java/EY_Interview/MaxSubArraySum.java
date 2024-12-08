package EY_Interview;

public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] arr = {-2, -4, -6};
        long sum = getMaxSum(arr);
        System.out.println("Maximum sum possible: " + sum);
    }

    private static long getMaxSum(int[] arr) {
        long sum = 0;
        long max = Long.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum > max) {
                max = sum;
            }
            if (sum < 0)
                sum = 0;

            if (max < 0)
                max = 0;
        }

        return max;
    }
}
