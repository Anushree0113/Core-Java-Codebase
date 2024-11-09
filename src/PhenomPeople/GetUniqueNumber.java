package PhenomPeople;

public class GetUniqueNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2};
        int result = getUniqueElement(arr);
        System.out.println("result = " + result);
    }

    private static int getUniqueElement(int[] arr) {
        int ans = 0;
        for (int val : arr) {
            ans = ans ^ val;
        }

        return ans;
    }
}
