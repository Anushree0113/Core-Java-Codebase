package PhenomPeople;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        int result = getMissingNumber(arr);
        System.out.println("result = " + result);
    }

    private static int getMissingNumber(int[] arr) {
        int n = arr.length;

        int sum = n * (n + 1) / 2;

        int presentSum = 0;

        for (int j : arr) {
            presentSum += j;
        }

        return sum - presentSum;
    }
}
