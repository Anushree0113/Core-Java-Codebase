package PhenomPeople;

import java.util.PriorityQueue;

public class FindKthSmallestElement {
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k = 2;
        getKthSmallestElement(arr, k);
    }

    //min heap
    private static void getKthSmallestElement(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int j : arr) {
            pq.add(j);
        }
        int f = k - 1;
        while (f > 0) {
            pq.remove();
            f--;
        }
        System.out.println("Kth Smallest Element: " + pq.peek());
    }
}
