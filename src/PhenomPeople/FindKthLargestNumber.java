package PhenomPeople;

import java.util.PriorityQueue;

public class FindKthLargestNumber {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;
        getKthLargest(arr, k);
    }

    //max heap
    private static void getKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int j : arr) {
            pq.add(j);
        }

        int f = k - 1;

        while (f > 0) {
            pq.remove();
            f--;
        }

        System.out.println("Kth largest element is " + pq.peek());
    }
}
