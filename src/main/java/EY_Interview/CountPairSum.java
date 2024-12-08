package EY_Interview;

public class CountPairSum {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int target = 4;

        int pairs = countPairSum(arr, target);
        System.out.println("pairs = " + pairs);
    }

    private static int countPairSum(int[] arr, int target) {
        int count = 0;

        int start = 0;

        int end = arr.length - 1;


        while (start < end) {

            if (arr[start] + arr[end] == target) {

                count++;

                //Since we have found a pair, then there will be no need for that pair that's why we update start and end

                start++;

                end--;

            } else if (arr[start] + arr[end] < target) {

                start++;

            } else {

                end--;

            }

        }

        return count > 0 ? count : -1;

    }
}
