package PhenomPeople;

import java.util.ArrayList;
import java.util.HashMap;

public class PairSum {

    public static void main(String[] args) {
        int[] arr = {2, 7, 11, 15};
        ArrayList<Integer> result = getPairSum(arr);

        System.out.println("result = " + result);
    }


    private static ArrayList<Integer> getPairSum(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        int targetSum = 9;

        for (int i = 0; i < arr.length; i++) {
            int complement = targetSum - arr[i];  // Find the complement that sums to 9

            // Check if the complement is already in the map
            if (map.containsKey(complement)) {
                result.add(complement);  // Add the complement (first number of the pair)
                result.add(arr[i]);      // Add the current number (second number of the pair)
            } else {
                map.put(arr[i], i);  // Store the current number in the map
            }
        }

        return result;
    }
}
